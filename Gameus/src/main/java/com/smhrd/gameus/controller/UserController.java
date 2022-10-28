package com.smhrd.gameus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@GetMapping("/hello")
	public String test() {
		return "why...한글이 깨지기 시작";
	}
}
