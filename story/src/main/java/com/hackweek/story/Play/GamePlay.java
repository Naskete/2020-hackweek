package com.hackweek.story.Play;

import com.hackweek.story.Bean.event;
import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Repository.eventRepository;
import com.hackweek.story.Repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class GamePlay {
    @Autowired
    private playerRepository playerRepository;
    //game start
    @GetMapping("/start")
    public gamePlayer start(@RequestParam(value = "name", required = false, defaultValue = "可乐") String name) {
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
    @GetMapping("/gameover")
    public Object gameOver(gamePlayer player){
        List<event> gameOverEvent=eventRepository.findeventOver();
        int num;
        if(player.getHunger()<=0){
            num=0;
            return gameOverEvent.get(num);
        }
        if (player.getHealth()<=0){
            num=1;
            return gameOverEvent.get(num);
        }
        if (player.getMoney()<=0){
            num=2;
            return gameOverEvent.get(num);
        }
        if (player.getEnergy()<=0){
            num=3;
            return gameOverEvent.get(num);
        }
        if (player.getMood()<=0){
            num=4;
            return gameOverEvent.get(num);
        }
        return "game over";
    }
    @GetMapping("/test")
    public Object test(){
        List<event> events=eventRepository.findeventsInHouse();
        Random random=new Random();
        int num=random.nextInt(5);
        return events.get(num);
    }
}