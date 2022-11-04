package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.VotingInfo;
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
	
	//전체 투표 목록 보기
	@GetMapping("/api/allpoll")
    public List<VotingListInfo> selectAllPoll(){
        return pollService.selectAllPoll();
	}
	
	//특정 투표 보기
	@PostMapping("/api/viewpoll")
    public VotingListInfo selectOnePoll(@RequestBody HashMap<String, Object> map) {
		return pollService.selectOnePoll(map);
	}
	
	//가장 최근 투표 보기
	@GetMapping("/api/recentpoll")
    public List<VotingListInfo> selectRecentPoll(){
        return pollService.selectRecentPoll();
	}
	
	//투표 항목별 결과
	@PostMapping("/api/polldetail")
    public List<HashMap<String, Object>> pollDetail(@RequestBody HashMap<String, Object> map) {
		System.out.println(pollService.pollDetail(map));
		return pollService.pollDetail(map);
		
		
	}

	//투표 참여
	@PostMapping("/api/voting")
	public String voting(@RequestBody HashMap<String, Object> map) {
		pollService.voting(map);
		return "thanks for your voting";

	}
	
	
}
