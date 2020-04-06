package com.hackweek.story.Play;

import com.hackweek.story.Bean.event;
import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Mapper.eventRepository;
import com.hackweek.story.Mapper.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class GamePlay {
    private playerRepository playerRepository;
    //game start
    @GetMapping("/start")
    public gamePlayer start(@RequestParam(value = "name", required = false, defaultValue = "可乐") String name) {
        gamePlayer player = new gamePlayer();
        player.setName(name);
        player.setHealthnum(100);
        player.setHungernum(100);
        player.setStrengthnum(100);
        player.setFoodnum(10);
        player.setMasknum(10);
        player.setMoney(1000);
        playerRepository.save(player);
        return player;
    }
    //获取所有事件
    @Autowired
    private eventRepository eventRepository;

    //事件（场景触发）
    @GetMapping("/house")
    public Object choose() {
        List<event> events= eventRepository.findeventsInHouse();
        return events;
    }
    @GetMapping("/gate")
    public Object gateEvents(){
        List<event> GateEvents=eventRepository.findeventsInHouse();
        return GateEvents;
    }
    @GetMapping("/supermarket")
    public Object superEvents(){
        List<event> marketEvnets=eventRepository.findeventsInSupermarker();
        return marketEvnets;
    }
    @GetMapping("/hospital")
    public Object hospital(){
        List<event> hostpitalEvents=eventRepository.findeventsInHospital();
        return  hostpitalEvents;
    }
    @GetMapping("/test")
    public Object test(){
        List<event> events=eventRepository.findeventsInHouse();
        Random random=new Random();
        int num=random.nextInt(5);
        return events.get(num);
    }
}