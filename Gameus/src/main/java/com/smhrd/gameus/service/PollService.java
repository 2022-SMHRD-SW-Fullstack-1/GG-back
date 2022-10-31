package com.smhrd.gameus.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.PollMapper;
import com.smhrd.gameus.model.VotingListInfo;


@Service
public class PollService {
	
	@Autowired
	PollMapper pollMapper;

	//새 투표 생성
	public void newPoll(HashMap <String,Object> map) {
		pollMapper.newPoll(map);
	}
}
