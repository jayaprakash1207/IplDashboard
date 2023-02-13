package com.jp.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.jp.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
    
    Team findByTeamName(String teamName);

}
