package com.hackweek.story.Repository;

import com.hackweek.story.Bean.gamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerRepository extends JpaRepository<gamePlayer,Integer> {
}
