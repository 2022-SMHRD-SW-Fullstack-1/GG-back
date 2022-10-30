package com.smhrd.gameus.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper {

	public void teamAdd(Map<String, Object> newTeamInfo);
	
}
