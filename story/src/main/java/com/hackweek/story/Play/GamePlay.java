package com.hackweek.story.Play;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hackweek.story.Bean.ResultJson;
import com.hackweek.story.Bean.event;
import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Repository.eventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class GamePlay {
    //获取事件
    @Autowired
    private eventRepository eventRepository;

    //game start
    @GetMapping("/start")
    public gamePlayer start() {
        //创建一个玩家对象，并设置初始值
        gamePlayer player = new gamePlayer();
        player.setEnergy(100);
        player.setHealth(100);
        player.setMood(100);
        player.setMask(20);
        player.setMoney(5000);
        return player;
    }

    //事件（场景触发）
    //家中
    @GetMapping("/house")
    public Object choose() {
        List<event> eventsInHouse=eventRepository.findeventsInHouse();
        return returnJson(eventsInHouse,eventsInHouse.size());
    }
    //小区门口
    @GetMapping("/gate")
    public Object gateEvents(){
        List<event> eventsInGate= eventRepository.findeventsInGAte();
        return returnJson(eventsInGate,eventsInGate.size());
    }
    //超市
    @GetMapping("/supermarket")
    public Object superEvents(){
        List<event> eventsInSupermasrket= eventRepository.findeventsInSupermarker();
        return returnJson(eventsInSupermasrket,eventsInSupermasrket.size());
    }
    //医院
    @GetMapping("/hospital")
    public Object hospital(){
        List<event> eventsInHospital= eventRepository.findeventsInHospital();
        return returnJson(eventsInHospital,eventsInHospital.size());
    }
    //game over
    @GetMapping("/gameover")
    public Object gameOver(){
        List<event> gameOver= eventRepository.findeventOver();
        return returnJson(gameOver,gameOver.size());
    }
    //定义方法
    //events 对应的事件列表，n 列表长度，即事件个数
    public List<ResultJson> returnJson(List<event> events,int n){
        List<ResultJson> resultJsons=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String str =events.get(i).getOptions();
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