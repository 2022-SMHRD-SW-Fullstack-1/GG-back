package com.smhrd.gameus.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.UserMapper;
import com.smhrd.gameus.model.UserInfo;

@Service
public class UserService {


		@Autowired
		UserMapper userMapper;

		public void signupAdd(Map<String, Object> signupInfo) {
			userMapper.signupAdd(signupInfo);

		}

		
		public String loginMember(UserInfo user) {
			return userMapper.loginMember(user);
	}
		
		
		
	}
		
	

