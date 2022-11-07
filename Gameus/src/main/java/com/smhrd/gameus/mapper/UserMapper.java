package com.smhrd.gameus.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.UserInfo;

@Mapper
public interface UserMapper {



	public void signupAdd(Map<String, Object> signupInfo);
	
	public String loginMember(UserInfo user);
}



