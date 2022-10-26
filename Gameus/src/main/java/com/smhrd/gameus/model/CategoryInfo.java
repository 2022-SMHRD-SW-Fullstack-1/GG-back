package com.smhrd.gameus.model;

import lombok.Data;

@Data
public class CategoryInfo {

	// 카테고리 순번 
    private int category_seq;

    // 게임 명 
    private String game_name;

    // 구분 
    private String game_section;

    // 내용 
    private String game_detail;
}
