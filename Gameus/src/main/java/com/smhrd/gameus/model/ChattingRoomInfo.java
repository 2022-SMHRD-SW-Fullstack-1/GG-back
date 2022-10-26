package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ChattingRoomInfo {

    // 방 순번 
    private int cr_seq;

    // 팀 순번 
    private int team_seq;

    // 방 제목 
    private String cr_title;

    // 방 내용 
    private String cr_content;

    // 방 개설일자 
    private Date cr_opendate;
    
}
