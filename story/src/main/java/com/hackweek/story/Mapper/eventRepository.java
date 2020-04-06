package com.hackweek.story.Mapper;

import com.hackweek.story.Bean.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface eventRepository extends JpaRepository<event,Integer> {
    @Query("select  s from event s where s.id>0 and s.id<8")
    List<event> findeventsInHouse();

    @Query("select s from event s where s.id>7 and s.id<12")
    List<event> findeventsInGAte();

    @Query("select s from event s where s.id>11 and s.id<17")
    List<event> findeventsInHospital();

    @Query("select s from event s where s.id>16 and s.id<21")
    List<event> findeventsInSupermarker();
}
