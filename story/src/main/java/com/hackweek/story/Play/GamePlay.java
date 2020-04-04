package com.hackweek.story.Play;

import com.hackweek.story.Bean.event;
import com.hackweek.story.Bean.gamePlayer;
import com.hackweek.story.Bean.place;
import com.hackweek.story.Mapper.eventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GamePlay {
    private int flag;

    List<event> roomevent;
    List<event> outdoorevent;

    List<place> room;
    List<place> outdoor;

    //game start
    @GetMapping("/start")
    public gamePlayer start(@RequestParam(value = "name", required = false, defaultValue = "可乐") String name) {
        gamePlayer player = new gamePlayer();
        player.setId(1);
        player.setName(name);
        player.setHealthnum(100);
        player.setStrengthnum(100);
        player.setFoodnum(10);
        player.setMasknum(10);
        player.setMoney(1000);
        return player;
    }
}