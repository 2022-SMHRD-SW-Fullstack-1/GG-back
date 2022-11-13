package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.ChatMapper;
import com.smhrd.gameus.model.ChattingInfo;
import com.smhrd.gameus.model.ChattingPlusInfo;

@Service
public class ChatService {
	
	@Autowired
	ChatMapper chatMapper;
	
	public void sendMessage(HashMap<String, Object> map) {
		chatMapper.sendMessage(map);
	}
	
	public List<ChattingPlusInfo> receiveMessage(String team_seq) {
		return chatMapper.receiveMessage(team_seq);
	}
	
}
