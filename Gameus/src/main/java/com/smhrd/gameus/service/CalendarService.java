package com.smhrd.gameus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.CalendarMapper;
import com.smhrd.gameus.model.CalendarInfo;

@Service
public class CalendarService {
	
	@Autowired
	CalendarMapper calendarMapper;
	
	public void addCalendar(Map<String, Object> schedule) {
		calendarMapper.addCalendar(schedule);
	}
	
	public List<CalendarInfo> viewAllCalendar() {
		return calendarMapper.viewAllCalendar();
	}
}
