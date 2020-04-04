package com.hackweek.story.Mapper;

import com.hackweek.story.Bean.gamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playRepository extends JpaRepository<gamePlayer,Integer> {
}
