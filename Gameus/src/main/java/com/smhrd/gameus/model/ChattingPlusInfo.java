package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ChattingPlusInfo {

    // 채팅 순번 
    private int chatting_seq;

    // 발화자 
    private String talker;

    // 발화 내용 
    private String msg;

    // 발화 시간 
    private Date msg_time;

    // 팀 순번 
    private int team_seq;
    
    // 발화자 닉네임
    private String user_nick;
    
    // 발화자 아이콘
    private String user_icon;

}
