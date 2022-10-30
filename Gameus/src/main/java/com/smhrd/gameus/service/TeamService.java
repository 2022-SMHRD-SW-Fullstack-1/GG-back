package com.smhrd.gameus.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.TeamMapper;

@Service
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	public void teamAdd(Map<String, Object> newTeamInfo) {
		teamMapper.teamAdd(newTeamInfo);
	}
	
	
}
