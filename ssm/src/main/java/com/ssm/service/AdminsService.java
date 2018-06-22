package com.ssm.service;

import java.util.List;

public interface AdminsService {
	public List adminLogin(String admin_name,String admin_pwd);
	public List admins_show();
	public void admins_add(String admin_name,String admin_pwd,String admin_grade);
	public void admins_deleteuser(String user_name);
//	public void admins_edituser(String user_name,String user_pwd);
	public void delete_admins(String admins_name);
	public void edit_admins(String admins_name,String admins_pwd);

	
	public void admins_notice(String admin_name,String notice_title,String notice_information,String notice_date);
	public void admins_news(String admin_name,String new_title,String new_information,String new_date,String fileName);
	public List notice_show();
	public List studentIdQuery(String stu_id);
	public List userIdQuery(String user_name);
	public List scores_show();
	public void notice_delete(int new_id);
	public List students_show();
	public void student_add(String stu_name,String stu_pwd,String stu_sex,String stu_date);
	public void student_delete(int stu_id);
	public List news_id_show(String new_id);
	public List notice_id_show(String new_id);
	public List stu_name_array();
	public List score_array();

}
