package com.smhrd.gameus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.CalendarInfo;
import com.smhrd.gameus.service.CalendarService;


@RestController
public class CalendarRestController {
	
	@Autowired
	CalendarService calendarService;
	
	@PostMapping("/api/teamroom/{team_seq}/calendar")
	public void addCalendar(@PathVariable("team_seq")String team_seq, @RequestBody Map<String, Object> schedule) {
		System.out.println(schedule);
		calendarService.addCalendar(team_seq, schedule);
	}
	
	@GetMapping("/api/teamroom/{team_seq}/calendar")
	public List<CalendarInfo> viewAllCalendar(@PathVariable("team_seq")String team_seq) {
		return calendarService.viewAllCalendar(team_seq);
		
	}
}