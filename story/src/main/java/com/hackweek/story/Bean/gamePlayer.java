package com.hackweek.story.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class gamePlayer {
    @Id
    @GeneratedValue
    private Integer id;
    //名字
    private String name;
    //健康值
    private Integer health;
    //体力值
    private Integer energy;
    //饥饿值
    private Integer hunger;
    //情绪
    private Integer mood;
    //食物
    private  Integer food;
    //口罩数
    private Integer mask;
    //金钱
    private  Integer money;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getHealth() { return health; }

    public void setHealth(Integer health) { this.health = health; }

    public Integer getEnergy() { return energy; }

    public void setEnergy(Integer energy) { this.energy = energy; }

    public Integer getHunger() { return hunger; }

    public void setHunger(Integer hunger) { this.hunger = hunger; }

    public Integer getMood() { return mood; }

    public void setMood(Integer mood) { this.mood = mood; }

    public Integer getFood() { return food; }

    public void setFood(Integer food) { this.food = food; }

    public Integer getMask() { return mask; }

    public void setMask(Integer mask) { this.mask = mask; }

    public Integer getMoney() { return money; }

    public void setMoney(Integer money) { this.money = money; }
}
