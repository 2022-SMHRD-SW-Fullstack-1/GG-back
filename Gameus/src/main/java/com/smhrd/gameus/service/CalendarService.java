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
	
	public void addCalendar(int team_seq, Map<String, Object> schedule) {
		calendarMapper.addCalendar(schedule);
	}
	
	public List<CalendarInfo> viewAllCalendar(String team_seq) {
		return calendarMapper.viewAllCalendar(team_seq);
	}
	
	public void updateCalendar(Map<String, Object> schedule) {
		calendarMapper.updateCalendar(schedule);
	}
	
	public void deleteCalendar(String cal_seq) {
		calendarMapper.deleteCalendar(cal_seq);
	}
}
