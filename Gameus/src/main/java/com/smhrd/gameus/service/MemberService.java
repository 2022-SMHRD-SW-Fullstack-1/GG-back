package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.MemberMapper;
import com.smhrd.gameus.model.TeamMember;


@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;
	
	public List<HashMap<String, Object>> selectAllTm(int num){
		return memberMapper.selectAllTm(num);
	}
	
	public void deleteTm(HashMap<String, Object> id) {
		memberMapper.deleteTm(id);
	}
	
	public void confirmTm(HashMap<String, Object> id) {
		memberMapper.confirmTm(id);
	}
	
	public void setFavor(HashMap<String, Object> id) {
		memberMapper.setFavor(id);
	}

}
