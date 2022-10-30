package com.smhrd.gameus.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.service.TeamService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TeamController {
	
	@Autowired
	TeamService teamService;
	
	@PostMapping("/newTeam")
	public void newTeam(@RequestBody Map<String, Object> newTeamInfo) {
		System.out.println(newTeamInfo.get("game"));

	}
}
