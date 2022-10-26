package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class TeamInfo {

    // 팀 순번 
    private int team_seq;

    // 팀 이름 
    private String team_name;

    // 팀 개설일자 
    private Date team_opendate;

    // 팀 정원 
    private int team_max;

    // 팀 개설자 
    private String user_id;
    
}
