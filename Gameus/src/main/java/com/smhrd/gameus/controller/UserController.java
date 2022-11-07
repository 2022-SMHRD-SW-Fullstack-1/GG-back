package com.smhrd.gameus.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smhrd.gameus.model.UserInfo;
import com.smhrd.gameus.service.UserService;

@Controller
public class UserController {

	
	Gson gs=new Gson();

	@Autowired
	UserService userService;	
	
	@PostMapping("/api/signup")
	public void signupAdd(@RequestBody Map<String, Object> signupInfo) {
		userService.signupAdd(signupInfo);
		System.out.println(signupInfo);
		}
	
	@PostMapping("/api/login")
	public String login(@RequestBody UserInfo user) {
		System.out.println(user);
		System.out.println("받아오는 아이디"+user.getUser_id());
		
		String jsonStr = gs.toJson(user);
    	System.out.println("로그인 :" + jsonStr);
    	
    	UserInfo users = gs.fromJson(jsonStr, UserInfo.class);
    	System.out.println(users.toString());
    	
    	String loginM = userService.loginMember(users);
		System.out.println(loginM);
		
		
		if(loginM!=null) {
			return "success";//로그인 성공	
		} else {
			return "fail";//로그인 실패
		}
	}
		
	}

		
		

	

	//@GetMapping("/api/logout")
	//public String logout(HttpSession session) {
		//session.removeAttribute("loginM");
		//return "redirect:/";
	//}
	
//	 @PostMapping("/login")
//	    public String login(@RequestBody Map<String, String> user) {
//	        User member = userRepository.findByEmail(user.get("email"))
//	                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 E-MAIL 입니다."));
//	        if (!passwordEncoder.matches(user.get("password"), member.getPassword())) {
//	            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
//	        }
//	        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
//	    }	
	

