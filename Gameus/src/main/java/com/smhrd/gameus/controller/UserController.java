package com.smhrd.gameus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api/hello")
	public String test() {
		return "백에서 보내기 성공....";
	}
}
