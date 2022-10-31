package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.VotingListInfo;
import com.smhrd.gameus.service.PollService;

@RestController
public class PollController {
	
	@Autowired
	PollService pollService;
	
	Gson gson=new Gson();

	//새 투표 생성
	@PostMapping("/api/newpoll")
    public String newPoll (@RequestBody HashMap<String, Object> map) {
        pollService.newPoll(map);

		return "새 투표 생성";
	}

}
