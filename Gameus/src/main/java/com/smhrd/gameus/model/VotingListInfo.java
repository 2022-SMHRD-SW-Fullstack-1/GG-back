package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class VotingListInfo {

    // 투표목록 순번 
    private int vl_seq;

    // 안건 명 
    private String vl_subject;

    // 투표 마감일 
    private Date vl_end_dt;

    // 생성 회원 
    private String user_id;

    // 팀 순번 
    private int team_seq;

    // 등록 일자 
    private Date reg_date;

    // 항목 
    private String vl_items;
    
}
