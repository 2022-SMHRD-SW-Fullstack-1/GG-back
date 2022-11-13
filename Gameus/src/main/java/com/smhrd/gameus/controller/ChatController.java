package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.ChattingInfo;
import com.smhrd.gameus.model.ChattingPlusInfo;
import com.smhrd.gameus.service.ChatService;

@RestController
public class ChatController {

	@Autowired
	ChatService chatService;
	
	@PostMapping("/api/chat/{team_seq}")
	public String sendMessage(@PathVariable("team_seq") int team_seq, @RequestBody HashMap<String, Object> map) {
		HashMap<String, Object> send = new HashMap<String, Object>(map);
		send.put("team_seq", team_seq);
		chatService.sendMessage(send);
		return "success";
	}
	
	@GetMapping("/api/chat/{team_seq}")
	public List<ChattingPlusInfo> receiveMessage(@PathVariable("team_seq") String team_seq) {
		return chatService.receiveMessage(team_seq);
	}
	
}