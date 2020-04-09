package com.hackweek.story.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class event {
    @Id
    private Integer id;
    private String name;
    private String description;
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