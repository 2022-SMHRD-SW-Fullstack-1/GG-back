package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class NotificationInfo {

    // 알림 순번 
    private int noti_seq;

    // 수신자 아이디 
    private String user_id;

    // 알림 내용 
    private String noti_msg;

    // 알림 전송 일자 
    private Date noti_dt;

    // 알림 확인 시간 
    private Date read_time;
    
    private int team_seq;
    
}
