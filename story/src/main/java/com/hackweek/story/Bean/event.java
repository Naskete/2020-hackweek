package com.hackweek.story.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class event {
    @Id
    //事件id
    private Integer id;
    //事件名称
    private String name;
    //事件的描述（问题）
    private String description;
    //事件的选项及及结果
    private String options;


    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getOptions() { return options; }

    public void setOptions(String options) { this.options = options; }
}