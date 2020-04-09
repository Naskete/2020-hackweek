package com.hackweek.story.Play;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hackweek.story.Bean.ResultJson;
import com.hackweek.story.Bean.event;
import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Repository.eventRepository;
import com.hackweek.story.Repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class GamePlay {
    @Autowired
    private playerRepository playerRepository;

    //game start
    @GetMapping("/start")
    public gamePlayer start(@RequestParam(value = "name", required = false, defaultValue = "可乐") String name) {
        //创建一个玩家对象，并设置初始值
        gamePlayer player = new gamePlayer();
        player.setName(name);
        player.setEnergy(100);
        player.setHealth(100);
        player.setHunger(100);
        player.setMood(100);
        player.setMask(5);
        player.setFood(5);
        player.setMoney(1000);
        playerRepository.save(player);
        return player;
    }
    //获取事件
    @Autowired
    private eventRepository eventRepository;

    //事件（场景触发）
    //家中
    @GetMapping("/house")
    public Object choose() {
        return eventRepository.findeventsInHouse();
    }
    //小区门口
    @GetMapping("/gate")
    public Object gateEvents(){
        return eventRepository.findeventsInGAte();
    }
    //超市
    @GetMapping("/supermarket")
    public Object superEvents(){
        return eventRepository.findeventsInSupermarker();
    }
    //医院
    @GetMapping("/hospital")
    public Object hospital(){
        return eventRepository.findeventsInHospital();
    }
    //game over
    @GetMapping("/gameover")
    public Object gameOver(){
        return eventRepository.findeventOver();
    }


    @GetMapping("/test")
    public Object test() {
        List<event> events = eventRepository.findeventsInHouse();
            List<ResultJson> resultJsons = new LinkedList<>();
            for (int i = 0; i < 6; i++) {
                String str = events.get(i).getOptions();
                JSONArray jsonArray = JSON.parseArray(str);
                ResultJson json = new ResultJson();
                json.setId(events.get(i).getId());
                json.setName(events.get(i).getName());
                json.setDescription(events.get(i).getDescription());
                json.setOptions(jsonArray);
                resultJsons.add(json);
            }
            return resultJsons;
        }
}