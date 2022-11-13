package com.smhrd.gameus.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

import com.smhrd.gameus.model.CategoryInfo;
import com.smhrd.gameus.model.GameUserInfo;
import com.smhrd.gameus.model.NotificationInfo;
import com.smhrd.gameus.model.UserInfo;

@Mapper
public interface UserMapper {

	public void signupAdd(Map<String, Object> signupInfo);

	public String loginMember(String id, String pw);
	
	public List<NotificationInfo> notiList(Map<String,Object> id);
	
	public void delNoti(Map<String,Object> delNoti);
	
	public void userGameInfo(String user_id, List<Integer> cateList);
	
	public List<Map<String, Object>> userProfile(Map<String, Object> user_nick);
	
	public List<CategoryInfo> userGame(Map<String, Object> usergame);
}
