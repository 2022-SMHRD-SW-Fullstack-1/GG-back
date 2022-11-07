package com.smhrd.gameus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.CalendarInfo;
import com.smhrd.gameus.service.CalendarService;


@RestController
public class CalendarRestController {
	
	@Autowired
	CalendarService calendarService;
	
	@PostMapping("/api/teamroom/calendar")
	public void addCalendar(@RequestBody Map<String, Object> schedule) {
		calendarService.addCalendar(schedule);
	}
	
	@GetMapping("/api/teamroom/calendar")
	public List<CalendarInfo> viewAllCalendar() {
		return calendarService.viewAllCalendar();
		
	}
}
