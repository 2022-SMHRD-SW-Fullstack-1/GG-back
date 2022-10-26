package com.smhrd.gameus.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CalendarInfo {

    // 캘린더 순번 
    private int cal_seq;

    // 캘린더 시작일 
    private Timestamp cal_s_dt;

    // 캘린더 종료일 
    private Timestamp cal_e_dt;

    // 일정 내용 
    private String cal_schedule;

    // 캘린더 사진 
    private String cal_img;

    // 작성자 아이디 
    private String user_id;

    // 팀 순번 
    private int team_seq;
}
