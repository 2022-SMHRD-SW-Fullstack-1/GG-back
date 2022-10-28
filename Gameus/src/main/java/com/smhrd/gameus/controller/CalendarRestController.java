package com.smhrd.gameus.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalendarRestController {
	
	@PostMapping("/teamroom/Calendar")
	public void addCalendar(@RequestBody Map<String, Object> data) {
		System.out.println(data.toString());
	}
}
