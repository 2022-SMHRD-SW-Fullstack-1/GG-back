package com.smhrd.gameus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.gameus.model.CategoryInfo;
import com.smhrd.gameus.service.FilterService;

@RestController
public class FilterRestController {
	
	@Autowired
	FilterService filterService;
	
	@GetMapping("/api/filter")
	public void filterMenu(@RequestParam("game") String game) {
//		List<CategoryInfo>
		System.out.println(game);
		
		filterService.filterMenu();
	}
}
