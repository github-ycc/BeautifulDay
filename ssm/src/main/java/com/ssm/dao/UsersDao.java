package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsersDao {
	public void admins_adduser(@Param("user_name")String user_name,@Param("user_pwd")String user_pwd);
	public void admins_edituser(String user_name,String user_pwd);
	public List show_user();
	public List userLogin(String user_name);
	public void user_score(@Param("stu_id")int stu_id,@Param("user_id")int user_id,@Param("score")int score);
}
