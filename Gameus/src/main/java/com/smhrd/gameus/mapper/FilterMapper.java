package com.smhrd.gameus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.smhrd.gameus.model.CategoryInfo;

@Mapper
public interface FilterMapper {
	
	@Select("select * from category_info where game_name=#{game}")
	public List<CategoryInfo> gameFilter(String game);
	
	public List<CategoryInfo> filterTeam(List<String> categoryNum);
	
	public List<CategoryInfo> commonFilterList();
}
