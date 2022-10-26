package com.smhrd.gameus.model;

import java.sql.Date;

import lombok.Data;

@Data
public class UserInfo {

	 // 회원 아이디 
    private String user_id;

    // 회원 비밀번호 
    private String user_pw;

    // 회원 닉네임 
    private String user_nick;

    // 회원 성별 
    private String user_gender;

    // 회원 생년월일 
    private String user_birthdate;

    // 회원 프로필아이콘 
    private String user_icon;

    // 회원 호감도 
    private int user_favor;

    // 회원 생성날짜 
    private Date user_joindate;
}
