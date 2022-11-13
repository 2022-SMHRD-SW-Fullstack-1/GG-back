package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.mapper.UserMapper;
import com.smhrd.gameus.model.GameUserInfo;
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
	
	public void delNoti(Map<String, Object> delNoti){
		userMapper.delNoti(delNoti);
	}

	public void userGameInfo(String user_id, List<Integer> cateList) {
		userMapper.userGameInfo(user_id, cateList);
	}
	
	public List<Map<String, Object>> userProfile(Map<String, Object> user_nick) {
		return userMapper.userProfile(user_nick);
	}
	
	public List<GameUserInfo> userGame(Map<String, Object> usergame){
		return userMapper.userGame(usergame);
	}
}
