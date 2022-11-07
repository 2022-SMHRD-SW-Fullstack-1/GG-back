package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatMapper {

	public void sendMessage(HashMap<String, Object> map);
	
	public List<HashMap<String, Object>> receiveMessage(HashMap<String, Object> cr_seq);
	
}
