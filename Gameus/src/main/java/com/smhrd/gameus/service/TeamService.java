package com.smhrd.gameus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.TeamMapper;
import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.model.UserInfo;

@Service
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	public void teamAdd(Map<String, Object> newTeamInfo) {
		teamMapper.teamAdd(newTeamInfo);
	}
	
	public List<TeamInfo>selectAllTeam(){
		return teamMapper.selectAllTeam();
	}
	
	public TeamInfo selectOneTeam(int team_seq) {
		return teamMapper.selectOneTeam(team_seq);
	}
	
//	public void teamJoin(UserInfo user) {
//		teamMapper.teamJoin(user);
//	}
	
}