package com.smhrd.gameus.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.PollMapper;
import com.smhrd.gameus.model.VotingCount;
import com.smhrd.gameus.model.VotingInfo;
import com.smhrd.gameus.model.VotingListInfo;

@Service
public class PollService {

	@Autowired
	PollMapper pollMapper;

	// 새 투표 생성
	public void newPoll(HashMap<String, Object> map) {
		pollMapper.newPoll(map);
	}

	// 전체 투표 목록 가져오기
	public List<VotingCount> selectAllPoll(String team_seq) {
		return pollMapper.selectAllPoll(team_seq);
	};

	// 특정 투표만 가져오기
	public VotingCount selectOnePoll(String team_seq, String vl_seq) {
		return pollMapper.selectOnePoll(team_seq, vl_seq);
	};

	// 가장 최근 투표 가져오기
	public List<VotingListInfo> selectRecentPoll() {
		return pollMapper.selectRecentPoll();
	};

	// 투표 결과
	public List<HashMap<String, Object>> pollDetail(HashMap<String, Object> map) {
		return pollMapper.pollDetail(map);
	}

	// 투표 참여
	public void voting(HashMap<String, Object> map) {
		pollMapper.voting(map);
	}

	public HashMap<String, Object> pollResult(HashMap<String, Object> map) {
		return pollMapper.pollResult(map);
	}
	
	public void pollSetting(String[] optionList)	{
	
	pollMapper.pollSetting(optionList);
	}


}