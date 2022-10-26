package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class TeamMember {

    // 구성 순번 
    private int tm_seq;

    // 팀 순번 
    private int team_seq;

    // 지원자 아이디 
    private String applicant;

    // 지원 일자 
    private Date tm_date;

    // 승인 여부 
    private String confirm_yn;
}
