package com.smhrd.gameus.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.CategoryInfo;
import com.smhrd.gameus.model.GameUserInfo;
import com.smhrd.gameus.model.NotificationInfo;
import com.smhrd.gameus.model.UserInfo;
import com.smhrd.gameus.service.UserService;

@RestController
public class UserController {
	
	Gson gs = new Gson();

	@Autowired
	UserService userService;	

	@PostMapping("/api/signup")
	public void signupAdd(@RequestBody Map<String, Object> signupInfo) {
		userService.signupAdd(signupInfo);
		
		String user_id = (String) signupInfo.get("email");
		List<Integer> cateList = (List<Integer>) signupInfo.get("gameCategory");
		
		userService.userGameInfo(user_id, cateList);
		}

	@PostMapping("/api/login")
	public String login(@RequestBody UserInfo user) {
		String jsonStr = gs.toJson(user);

    	UserInfo users = gs.fromJson(jsonStr, UserInfo.class);

    	String loginM = userService.loginMember(users.getUser_id(), user.getUser_pw());

		if(loginM!=null) {
			return "success"; //로그인 성공	
		} else {
			return "fail";//로그인 실패
		}
	}
	
	@PostMapping("/api/notification")
	public List<NotificationInfo> notiList(@RequestBody Map<String, Object> id){
		return userService.notiList(id);
	}
	
	@PostMapping("/api/delnoti")
	public List<NotificationInfo> delNoti(@RequestBody Map<String, Object> delNoti){
		userService.delNoti(delNoti);
		return userService.notiList(delNoti);
	}
	
	@PostMapping("/api/profile")
	public List<Map<String, Object>> userProfile(@RequestBody Map<String, Object> user_nick) {
		return userService.userProfile(user_nick);
	}
	
	@PostMapping("/api/usergame")
	public List<CategoryInfo> userGame(@RequestBody List<Integer> usergame){
		return userService.userGame(usergame);
	}
	
	
}

