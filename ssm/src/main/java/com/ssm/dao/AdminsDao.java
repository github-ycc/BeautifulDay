package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdminsDao {
	public List  adminLogin(String admin_name);
	public List admins_show();
	public void admins_add(@Param("admin_name")String admin_name,@Param("admin_pwd")String admin_pwd,@Param("admin_grade")String admin_grade);
	public void admins_deleteuser(String user_name);
//	public void admins_edituser(String user_name,String user_pwd);
	public void delete_admins(@Param("admins_name")String admins_name);
	public void edit_admins(@Param("admins_name")String admins_name,@Param("admins_pwd")String admins_pwd);
	
	public void admins_notice(@Param("admin_name")String admin_name,@Param("notice_title") String notice_title,@Param("notice_information") String notice_information,@Param("notice_date") String notice_date);
	public void admins_news(@Param("admin_name")String admin_name,@Param("new_title") String new_title,@Param("new_information") String new_information,@Param("new_date") String new_date,@Param("fileName") String fileName);
	public List notice_show();
	public List studentIdQuery(String stu_id);
	public List userIdQuery(String user_name);
	public List scores_show();
	public void notice_delete(@Param("new_id")int new_id);
	public List students_show();
	public void student_add(@Param("stu_name")String stu_name,@Param("stu_pwd")String stu_pwd,@Param("stu_sex")String stu_sex,@Param("stu_date")String stu_date);
	public void student_delete(@Param("stu_id")int stu_id);
	public List news_id_show(String new_id);
	public List notice_id_show(String new_id);
	public List stu_name_array();
	public List score_array();

}
