package com.smhrd.gameus.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smhrd.gameus.model.CalendarInfo;

@Mapper
public interface CalendarMapper {


	@Insert("insert into calendar_info values(null, #{start}, #{end}, #{title}, null, #{groupId}, #{team_seq})")
	public void addCalendar(Map<String, Object> schedule);

	@Select("select * from calendar_info where team_seq=#{team_seq}")
	public List<CalendarInfo> viewAllCalendar(String team_seq);

	@Update("update calendar_info "
			+ "set cal_schedule=#{title}, cal_s_dt=#{start}, cal_e_dt=#{end} "
			+ "where cal_seq=#{cal_seq}")
	public void updateCalendar(Map<String, Object> schedule);
	
	@Delete("delete from calendar_info where cal_seq=#{cal_seq}")
	public void deleteCalendar(String cal_seq);
}
