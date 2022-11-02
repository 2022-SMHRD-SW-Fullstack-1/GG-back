package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.model.TeamMember;
import com.smhrd.gameus.service.TeamService;

@RestController
public class TeamController {
	
	Gson gson = new Gson();
	
	@Autowired
	TeamService teamService;
	
	@PostMapping("/api/team")
	public void teamAdd(@RequestBody Map<String, Object> newTeamInfo) {
		teamService.teamAdd(newTeamInfo);
//		HashMap<String, Object> resultMap = new HashMap<String, Object>();
//		
//		resultMap.put("result", "success");
//		
//		Gson gson = new Gson();
//		
//		String result = gson.toJson(resultMap);
	
	}
	
	@GetMapping("/api/allteam")
    public List<TeamInfo> list(){
        return teamService.selectAllTeam();
	}
	
	@GetMapping("/api/teamcheck/{team_seq}")
	public String teamMore(@PathVariable("team_seq") int team_seq) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("selectTm",teamService.selectTm(team_seq));
		map.put("selectOneTeam", teamService.selectOneTeam(team_seq));
		
		Gson gson = new Gson();
		
		String result = gson.toJson(map);
		
		return result;
	}
	
	@PostMapping("/api/teamjoin")
	public void teamJoin(@RequestBody Map<String, Object> tJoin) {
		teamService.teamJoin(tJoin);
	}
	
}
