package com.smhrd.gameus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.TeamMapper;
import com.smhrd.gameus.model.TeamInfo;

@Service
public class TeamService {
	
	@Autowired
	TeamMapper teamMapper;
	
	public List<TeamInfo>selectAllTeam(){
		return teamMapper.selectAllTeam();

	};

}
