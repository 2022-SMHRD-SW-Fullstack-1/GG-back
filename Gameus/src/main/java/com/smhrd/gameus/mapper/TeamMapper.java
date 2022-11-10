package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.model.CategoryInfo;
import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.model.TeamMember;

@Mapper
public interface TeamMapper {

	public void teamAdd(Map<String, Object> newTeamInfo);
	
	public void teamCap(Map<String, Object> newTeamInfo);
	
	public List<TeamInfo> selectAllTeam();
	
	public List<TeamInfo> selectMyTeam(HashMap<String, Object> map);
	
	public TeamInfo selectOneTeam(HashMap<String, Object> map);
	
	public int selectTm(HashMap<String, Object> map);
	
	public void teamJoin(Map<String, Object> tJoin);
	
	public List<CategoryInfo> teamGameSetting();
	
	public String isJoined(HashMap<String, Object> tJoin);
	
	public void capNoti(HashMap<String, Object> tJoin);
	
	public String notiTeamName(Map<String, Object> team_seq);
}
