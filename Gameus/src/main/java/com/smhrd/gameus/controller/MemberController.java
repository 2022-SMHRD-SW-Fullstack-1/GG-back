package com.smhrd.gameus.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService memberService;
			
	@GetMapping("/api/teamsetting{team_seq}")
	public List<HashMap<String, Object>> selectAllTm(@PathVariable("team_seq") int num) {
		return memberService.selectAllTm(num);
	}
	
	@PostMapping("/api/teammember/delete")
	public void deleteTm(@RequestBody HashMap<String, Object> id) {
		System.out.println(id);
		memberService.deleteTm(id);
	}
	
	@PostMapping("/api/teammember/confirm")
	public void confirmTm(@RequestBody HashMap<String, Object> id) {
		System.out.println(id);
		memberService.confirmTm(id);
	}
	
	@PostMapping("/api/teammember/update")
	public String setFavor(@RequestBody HashMap<String, Object> id) {
		System.out.println(id);
		memberService.setFavor(id);
		return "success";
	}
	
	
}
