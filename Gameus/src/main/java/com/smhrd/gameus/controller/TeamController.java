package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	TeamService teamService;

//	@GetMapping("/allteam")
//	public String Main(Model model) {
//		model.addAttribute("teamList", teamService.selectAllTeam());
//		return "teamListDisplay";
//
//	}

	// 전체 팀 목록 보기
	@GetMapping("/api/allteam")
	public List<TeamInfo> list() {
		return teamService.selectAllTeam();
	}

	// 내 팀 목록 보기
	@PostMapping("/api/myteam")
	public List<TeamInfo> myteam(@RequestBody HashMap<String, Object> map) {
		return teamService.selectMyTeam(map);
	}
	
}
