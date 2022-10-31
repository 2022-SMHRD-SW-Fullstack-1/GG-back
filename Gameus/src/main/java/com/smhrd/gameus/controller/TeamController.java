package com.smhrd.gameus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.TeamInfo;
import com.smhrd.gameus.service.TeamService;

@CrossOrigin(origins = "http://localhost:8090")
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
	
	@GetMapping("/allteam")
    public List<TeamInfo> list(){
        return teamService.selectAllTeam();

	}

}
