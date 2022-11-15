package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.ChattingInfo;
import com.smhrd.gameus.model.ChattingPlusInfo;

@Mapper
public interface ChatMapper {

	public void sendMessage(HashMap<String, Object> map);
	
	public List<ChattingPlusInfo> receiveMessage(String team_seq);
	
}
