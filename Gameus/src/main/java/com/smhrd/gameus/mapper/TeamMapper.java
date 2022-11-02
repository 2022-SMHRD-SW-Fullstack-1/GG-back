package com.smhrd.gameus.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.TeamInfo;

@Mapper
public interface TeamMapper {

	public void teamAdd(Map<String, Object> newTeamInfo);
	
	public List<TeamInfo> selectAllTeam();
	
	public TeamInfo selectOneTeam(int team_seq);
	
//	public void teamJoin(UserInfo user);
}
