package com.smhrd.gameus.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.VotingListInfo;

@Mapper
public interface PollMapper {
	
	public void newPoll(HashMap<String,Object> map);

	
}
