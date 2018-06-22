package com.ssm.service;

import java.util.List;

public interface UsersService {
	public void admins_adduser(String user_name,String user_pwd);
	public void admins_edituser(String user_name,String user_pwd);
	public List show_user();
	public List userLogin(String user_name,String user_pwd);
	public void user_score(int stu_id,int user_id,int score);
}
