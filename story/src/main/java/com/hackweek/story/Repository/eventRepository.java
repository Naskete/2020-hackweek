package com.hackweek.story.Repository;

import com.hackweek.story.Bean.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface eventRepository extends JpaRepository<event,Integer> {
    @Query("select  s from event s where s.id>0 and s.id<22")
    List<event> findeventsInHouse();

    @Query("select s from event s where s.id>25 and s.id<28")
    List<event> findeventsInGAte();

    @Query("select s from event s where s.id=28")
    List<event> findeventsInHospital();

    @Query("select s from event s where s.id>21 and s.id<26")
    List<event> findeventsInSupermarker();

    @Query("select s from event s where s.id>28 and s.id<38")
    List<event> findeventOver();
}
