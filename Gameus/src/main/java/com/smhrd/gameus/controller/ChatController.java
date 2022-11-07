package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.service.ChatService;

@RestController
public class ChatController {

	@Autowired
	ChatService chatService;
	
	@PostMapping("/api/chat/send")
	public String sendMessage(@RequestBody HashMap<String, Object> map) {
		chatService.sendMessage(map);
		return "success";
	}
	
	@PostMapping("/api/chat/receive")
	public List<HashMap<String, Object>> receiveMessage(@RequestBody HashMap<String, Object> map) {
		return chatService.receiveMessage(map);
	}
	
}