package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.TeamMapper;
import com.smhrd.gameus.model.TeamInfo;

@Service
public class TeamService {
	
	@Autowired
	TeamMapper teamMapper;
	
	public List<TeamInfo>selectAllTeam(){
		return teamMapper.selectAllTeam();
	};
	
	public List<TeamInfo> selectMyTeam(@RequestBody HashMap<String, Object> map) {
		return teamMapper.selectMyTeam(map);
	}

	
}
