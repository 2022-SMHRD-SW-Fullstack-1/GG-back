package com.smhrd.gameus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.UserMapper;
import com.smhrd.gameus.model.NotificationInfo;
import com.smhrd.gameus.model.UserInfo;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public void signupAdd(Map<String, Object> signupInfo) {
		userMapper.signupAdd(signupInfo);
	}

	public String loginMember(String id, String pw) {
		return userMapper.loginMember(id, pw);
	}
	
	public List<NotificationInfo> notiList(Map<String,Object> id){
		return userMapper.notiList(id);
	}
}
