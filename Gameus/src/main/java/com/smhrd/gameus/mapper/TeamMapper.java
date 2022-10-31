package com.smhrd.gameus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.TeamInfo;

@Mapper
public interface TeamMapper {

	public List<TeamInfo> selectAllTeam();
}
