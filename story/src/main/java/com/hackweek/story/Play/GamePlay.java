package com.hackweek.story.Play;

import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Repository.eventRepository;
import com.hackweek.story.Repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    //获取事件
    @Autowired
    private eventRepository eventRepository;

    //事件（场景触发）
    @GetMapping("/house")
    public Object choose() {
        return eventRepository.findeventsInHouse();
    }
    @GetMapping("/gate")
    public Object gateEvents(){
        return eventRepository.findeventsInGAte();
    }
    @GetMapping("/supermarket")
    public Object superEvents(){
        return eventRepository.findeventsInSupermarker();
    }
    @GetMapping("/hospital")
    public Object hospital(){
        return eventRepository.findeventsInHospital();
    }
    @GetMapping("/gameover")
    public Object gameOver(){
        return eventRepository.findeventOver();
    }
}