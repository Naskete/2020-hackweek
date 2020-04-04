package com.hackweek.story.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gamePlayer {
    @Id
    private Integer id;
    //名字
    private String name;
    //健康值
    private Integer healthnum;
    //体力值
    private Integer strengthnum;
    //食物
    private  Integer foodnum;
    //口罩数
    private Integer masknum;
    //金钱
    private  Integer money;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getHealthnum() { return healthnum; }

    public void setHealthnum(Integer healthnum) { this.healthnum = healthnum; }

    public Integer getStrengthnum() { return strengthnum; }

    public void setStrengthnum(Integer strengthnum) { this.strengthnum = strengthnum; }

    public Integer getFoodnum() { return foodnum; }

    public void setFoodnum(Integer foodnum) { this.foodnum = foodnum; }

    public Integer getMasknum() { return masknum; }

    public void setMasknum(Integer masknum) { this.masknum = masknum; }

    public Integer getMoney() { return money; }

    public void setMoney(Integer money) { this.money = money; }
}
