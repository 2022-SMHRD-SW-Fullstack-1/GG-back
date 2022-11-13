package com.smhrd.gameus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.NotificationInfo;
import com.smhrd.gameus.model.UserInfo;
import com.smhrd.gameus.service.UserService;

@RestController
public class UserController {
	
	Gson gs=new Gson();

	@Autowired
	UserService userService;	

	@PostMapping("/api/signup")
	public void signupAdd(@RequestBody Map<String, Object> signupInfo) {
		userService.signupAdd(signupInfo);
		System.out.println(signupInfo);
		}

//	@PostMapping("/api/login")
//	public Map<String,Object> login(@RequestBody UserInfo user) {
//		String jsonStr = gs.toJson(user);
//
//    	UserInfo users = gs.fromJson(jsonStr, UserInfo.class);
//
//    return	userService.loginMember(users.getUser_id(), user.getUser_pw());
//
//
//	
//	}
	
	
	@PostMapping("/api/login")
	public String login(@RequestBody UserInfo user) {
		System.out.println(user);
		System.out.println("받아오는 아이디"+user.getUser_id());

		String jsonStr = gs.toJson(user);
    	System.out.println("로그인 :" + jsonStr);

    	UserInfo users = gs.fromJson(jsonStr, UserInfo.class);
    	System.out.println(users.toString());

    	String loginM = userService.loginMember(users.getUser_id(), user.getUser_pw());
		System.out.println(loginM);

		if(loginM!=null) {
			return "success";//로그인 성공	
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
	
}

