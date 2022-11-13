package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.TeamMapper;
import com.smhrd.gameus.model.CategoryInfo;
import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.model.TeamMember;
import com.smhrd.gameus.model.UserInfo;

@Service
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	public void teamAdd(Map<String, Object> newTeamInfo) {
		teamMapper.teamAdd(newTeamInfo);
		teamMapper.teamCap(newTeamInfo);
	}
	
	public List<Map<String, Object>> selectAllTeam() {
		return teamMapper.selectAllTeam();
	}
	
	public Map<String, Object> selectOneTeam(HashMap<String, Object> map) {
		return teamMapper.selectOneTeam(map);
	}
	
	public int selectTm(HashMap<String, Object> map) {
		return teamMapper.selectTm(map);
	}
	
	public void teamJoin(Map<String, Object> tJoin) {
		teamMapper.teamJoin(tJoin);
		
	}
	
	public List<CategoryInfo> teamGameSetting() {
		return teamMapper.teamGameSetting();
	}
	
	public List<TeamInfo> selectMyTeam(HashMap<String, Object> map) {
		return teamMapper.selectMyTeam(map);
	}

	public String isJoined(HashMap<String, Object> tJoin) {
		return teamMapper.isJoined(tJoin);
	}
	
	public void capNoti(HashMap<String, Object> tJoin) {
		teamMapper.capNoti(tJoin);
	}
	
	public String notiTeamName(Map<String, Object> team_seq) {
		return teamMapper.notiTeamName(team_seq);
	}
	
	public Map<String, Object> teamAccess(Map<String, Object> user) {
		return teamMapper.teamAccess(user);
	}
	
//	public String isJoined(String yn) {
//		return teamMapper.isJoined(yn);
//	}
	
}
