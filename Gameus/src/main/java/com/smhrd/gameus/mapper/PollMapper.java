package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.model.VotingInfo;
import com.smhrd.gameus.model.VotingListInfo;

@Mapper
public interface PollMapper {
	
	public void newPoll(HashMap<String,Object> map);

	public List<VotingListInfo> selectAllPoll();
	
	public VotingListInfo selectOnePoll(HashMap<String,Object> map);
	
	public List<VotingListInfo> selectRecentPoll();
	
	public List<HashMap<String, Object>> pollDetail(HashMap<String,Object> map);
	
	public void voting(HashMap<String,Object> map);
	
	public void pollSetting(String[] optionList);
	
	public String pollResult (String [] optionList);

}
