package com.smhrd.gameus.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.gameus.model.NotificationInfo;

@Mapper
public interface UserMapper {

	public void signupAdd(Map<String, Object> signupInfo);

	public String loginMember(String id, String pw);
	
	public List<NotificationInfo> notiList(Map<String,Object> id);
	
}
