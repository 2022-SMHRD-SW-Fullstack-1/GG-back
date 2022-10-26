package com.smhrd.gameus.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class VotingInfo {

    // 투표 순번 
    private int vt_seq;

    // 투표자 아이디 
    private String user_id;

    // 투표 목록 순번 
    private int vl_seq;

    // 투표 내용 
    private String vt_result;

    // 투표 일자 
    private Timestamp vt_date;

}
