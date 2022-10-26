package com.smhrd.gameus.model;

import lombok.Data;

@Data
public class GameUserInfo {

	//정보 순번
	private int gameinfo_seq;
	
	//회원 아이디
	private String user_id;
	
	//카테고리 순번
	private int game_category;
}
