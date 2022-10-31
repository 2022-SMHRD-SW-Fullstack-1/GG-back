package com.smhrd.gameus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.FilterMapper;
import com.smhrd.gameus.model.CategoryInfo;

@Service
public class FilterService {
	
	@Autowired
	FilterMapper filterMapper;
	
	public void filterMenu() {
		List<CategoryInfo> position = filterMapper.positionFilter();
		List<CategoryInfo> tier = filterMapper.tierFilter();

		System.out.println(tier);
	}
}
