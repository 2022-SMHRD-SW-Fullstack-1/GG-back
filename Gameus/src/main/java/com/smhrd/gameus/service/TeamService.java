package com.smhrd.gameus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.TeamMapper;

@Service
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	
	
}
