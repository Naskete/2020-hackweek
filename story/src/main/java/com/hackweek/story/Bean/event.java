package com.hackweek.story.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class event {
    @Id
    private Integer id;
    private String eventname;
    private String content;
    private String problem;
    private String answerA;
    private int flagA;
    private String answerB;
    private int flagB;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getEventname() { return eventname; }

    public void setEventname(String eventname) { this.eventname = eventname; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public String getProblem() { return problem; }

    public void setProblem(String problem) { this.problem = problem; }

    public String getAnswerA() { return answerA; }

    public void setAnswerA(String answerA) { this.answerA = answerA; }

    public int getFlagA() { return flagA; }

    public void setFlagA(int flagA) { this.flagA = flagA; }

    public String getAnswerB() { return answerB; }

    public void setAnswerB(String answerB) { this.answerB = answerB; }

    public int getFlagB() { return flagB; }

    public void setFlagB(int flagB) { this.flagB = flagB; }
}