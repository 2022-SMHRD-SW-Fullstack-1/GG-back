package com.smhrd.gameus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
public class UserController {

	@GetMapping("/hello")
	public String test() {
		return "백에서 보내기 성공....";
	}
}
