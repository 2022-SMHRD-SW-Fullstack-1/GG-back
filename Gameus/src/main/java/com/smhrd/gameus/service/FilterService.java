package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.FilterMapper;
import com.smhrd.gameus.model.CategoryInfo;

@Service
public class FilterService {
	
	@Autowired
	FilterMapper filterMapper;
	
	public List<CategoryInfo> filterMenu(String game) {
		return filterMapper.gameFilter(game);
		
	}
	
	public List<CategoryInfo> filterTeam(List<String> categoryNum) {
		System.out.println(filterMapper.filterTeam(categoryNum));
		return filterMapper.filterTeam(categoryNum);
	}
	
	public List<CategoryInfo> commonFilterList() {
		return filterMapper.commonFilterList();
	}
}
