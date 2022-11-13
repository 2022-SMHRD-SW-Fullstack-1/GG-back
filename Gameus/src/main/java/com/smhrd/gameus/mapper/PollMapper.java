package com.smhrd.gameus.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.model.VotingCount;
import com.smhrd.gameus.model.VotingInfo;
import com.smhrd.gameus.model.VotingListInfo;

@Mapper
public interface PollMapper {
	
	public void newPoll(HashMap<String,Object> map);

	public List<VotingCount> selectAllPoll(String team_seq);
	
	public VotingCount selectOnePoll(String team_seq, String vl_seq);
	
	public List<VotingListInfo> selectRecentPoll();
	
	public List<HashMap<String, Object>> pollDetail(HashMap<String,Object> map);
	
	public void voting(HashMap<String,Object> map);
	
	public void pollSetting(String[] optionList);
	
	public HashMap<String, Object> pollResult (HashMap<String, Object> map);

}
