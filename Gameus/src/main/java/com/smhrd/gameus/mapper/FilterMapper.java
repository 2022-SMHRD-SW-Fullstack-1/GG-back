package com.smhrd.gameus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.smhrd.gameus.model.CategoryInfo;

@Mapper
public interface FilterMapper {
	
	@Select("select * from category_info where game_name=#{game} and game_section='p'")
	public List<CategoryInfo> positionFilter();

	@Select("select * from category_info where game_name=#{game} and game_section='t'")
	public List<CategoryInfo> tierFilter();
	
}
