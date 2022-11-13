package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ChattingInfo {

    // 채팅 순번 
    private int chatting_seq;

    // 발화자 
    private String talker;

    // 발화 내용 
    private String msg;

    // 발화 시간 
    private Date msg_time;

    // 방 순번 
    private int team_seq;
    
}
