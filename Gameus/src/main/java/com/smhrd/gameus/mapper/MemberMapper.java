package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberMapper {

	public List<HashMap<String, Object>> selectAllTm(int num);
	
	public void deleteTm(HashMap<String, Object> id);
	
	public void confirmTm(HashMap<String, Object> id);
	
	public void setFavor(HashMap<String, Object> id);

}
