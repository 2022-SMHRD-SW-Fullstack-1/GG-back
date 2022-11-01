package com.smhrd.gameus.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.gameus.mapper.FilterMapper;

@Service
public class FilterService {
	
	@Autowired
	FilterMapper filterMapper;
	
	public HashMap<String, Object> filterMenu(String game) {
		List<String> position = filterMapper.positionFilter(game);
		HashMap<String, Object> filterMenu = new HashMap<>();
		filterMenu.put("position", position);
		
		if(game.equals("lostark")) {
			List<String> dungeon = filterMapper.dungeonFilter(game);
			filterMenu.put("dungeon", dungeon);
			return filterMenu;
			
		}else {
			List<String> tier = filterMapper.tierFilter(game);
			filterMenu.put("tier", tier);
			return filterMenu;
		}
		
	}
}
