package com.smhrd.gameus.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.service.TeamService;

@RestController
public class TeamController {
	
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
	
//	@GetMapping("/api/")
//	public void teamJoin() {
//		
//	}
//	
//	@GetMapping("/api/")
//	public void teamSearch() {
//		
//	}
}
