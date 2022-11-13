package com.smhrd.gameus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.smhrd.gameus.model.VotingCount;
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
		HashMap<String, Object> item = new HashMap<String, Object> (map);
		String option = (String) map.get("options");
//		String[] optionList = option.split(",");
		System.out.println(option);
        Gson gson = new Gson();
        String[] optionList = gson.fromJson(option, String[].class);

        item.put("items", optionList);
		System.out.println(item);
				 
		pollService.newPoll(item);
//		pollService.pollSetting(optionList);
		
		return "새 투표 생성";
	}
	
	//전체 투표 목록 보기
	@GetMapping("/api/teamroom/{team_seq}/poll")
    public List<VotingCount> selectAllPoll(@PathVariable("team_seq") String team_seq){
        return pollService.selectAllPoll(team_seq);
	}
	
	//특정 투표 보기
	@GetMapping("/api/teamroom/{team_seq}/poll/{vl_seq}")
    public VotingCount selectOnePoll(@PathVariable("team_seq") String team_seq, @PathVariable("vl_seq") String vl_seq) {
		return pollService.selectOnePoll(team_seq, vl_seq);
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
	
	@PostMapping("/api/pollresult")
	public HashMap<String,Object> pollResult(@RequestBody HashMap<String, Object> map){
	System.out.println(map);
		Gson gson = new Gson();
//		String option = (String) map.get("vt_items");
//		System.out.println(option);
//        String[] optionList = gson.fromJson(option, String[].class);
//		String[] optionList = map.get("vt_items");
		ArrayList optionList = (ArrayList) map.get("vt_items");

		System.out.println(optionList);
        System.out.println(pollService.pollResult(map));
        return pollService.pollResult(map) ;
	}
	
	
}

