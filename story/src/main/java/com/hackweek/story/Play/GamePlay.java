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
        List<event> eventsInHouse=eventRepository.findeventsInHouse();
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i=0;i<7;i++){
            String str =eventsInHouse.get(i).getOptions();
            JSONArray jsonArray = JSON.parseArray(str);
            ResultJson json = new ResultJson();
            json.setId(eventsInHouse.get(i).getId());
            json.setName(eventsInHouse.get(i).getName());
            json.setDescription(eventsInHouse.get(i).getDescription());
            json.setOptions(jsonArray);
            resultJsons.add(json);
        }
        return resultJsons;
    }
    //小区门口
    @GetMapping("/gate")
    public Object gateEvents(){
        List<event> eventsInGate= eventRepository.findeventsInGAte();
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            String str =eventsInGate.get(i).getOptions();
            JSONArray jsonArray = JSON.parseArray(str);
            ResultJson json = new ResultJson();
            json.setId(eventsInGate.get(i).getId());
            json.setName(eventsInGate.get(i).getName());
            json.setDescription(eventsInGate.get(i).getDescription());
            json.setOptions(jsonArray);
            resultJsons.add(json);
        }
        return resultJsons;
    }
    //超市
    @GetMapping("/supermarket")
    public Object superEvents(){
        List<event> eventsInSupermasrket= eventRepository.findeventsInSupermarker();
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            String str =eventsInSupermasrket.get(i).getOptions();
            JSONArray jsonArray = JSON.parseArray(str);
            ResultJson json = new ResultJson();
            json.setId(eventsInSupermasrket.get(i).getId());
            json.setName(eventsInSupermasrket.get(i).getName());
            json.setDescription(eventsInSupermasrket.get(i).getDescription());
            json.setOptions(jsonArray);
            resultJsons.add(json);
        }
        return resultJsons;
    }
    //医院
    @GetMapping("/hospital")
    public Object hospital(){
        List<event> eventsInHospital= eventRepository.findeventsInHospital();
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            String str =eventsInHospital.get(i).getOptions();
            JSONArray jsonArray = JSON.parseArray(str);
            ResultJson json = new ResultJson();
            json.setId(eventsInHospital.get(i).getId());
            json.setName(eventsInHospital.get(i).getName());
            json.setDescription(eventsInHospital.get(i).getDescription());
            json.setOptions(jsonArray);
            resultJsons.add(json);
        }
        return resultJsons;
    }
    //game over
    @GetMapping("/gameover")
    public Object gameOver(){
        List<event> gameOver= eventRepository.findeventOver();
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            String str =gameOver.get(i).getOptions();
            JSONArray jsonArray = JSON.parseArray(str);
            ResultJson json = new ResultJson();
            json.setId(gameOver.get(i).getId());
            json.setName(gameOver.get(i).getName());
            json.setDescription(gameOver.get(i).getDescription());
            json.setOptions(jsonArray);
            resultJsons.add(json);
        }
        return resultJsons;
    }
}