package com.hackweek.story.Mapper;

import com.hackweek.story.Bean.event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface eventRepository extends JpaRepository<event,Integer> {
}
