package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.AdminsDao;

@Service("AdminsService")
public class AdminsServiceImpl implements AdminsService {
	@Resource
	private AdminsDao adminsDao;
	
	@Override    
    public List adminLogin(String admin_name,String admin_pwd) {
		List list = adminsDao.adminLogin(admin_name);
        return list;
    }

	@Override
	public List admins_show() {
		
		return adminsDao.admins_show();
	}
	
	@Override
	public void admins_add(String admin_name,String admin_pwd,String admin_grade) {
		adminsDao.admins_add(admin_name,admin_pwd,admin_grade);
	}
	
	@Override
	public void admins_deleteuser(String user_name) {
		adminsDao.admins_deleteuser(user_name);
		
	}
	
	/*@Override
	public void admins_edituser(String user_name, String user_pwd) {
		// TODO Auto-generated method stub
		
	}*/


	
	@Override
	public void delete_admins(String admins_name) {
		adminsDao.delete_admins(admins_name);
		
	}

	@Override
	public void edit_admins(String admins_name, String admins_pwd) {
		adminsDao.edit_admins(admins_name, admins_pwd);
		
	}
	
	@Override
	public void admins_notice(String admin_name,String notice_title, String notice_information, String notice_date) {
		adminsDao.admins_notice(admin_name,notice_title, notice_information, notice_date);
	}

	@Override
	public void admins_news(String admin_name,String new_title, String new_information, String new_date,String fileName) {
		adminsDao.admins_news(admin_name,new_title, new_information, new_date, fileName);
		
	}
	
	@Override
	public List notice_show() {	
		return adminsDao.notice_show();
	}
	public List studentIdQuery(String stu_id) {	
		return adminsDao.studentIdQuery(stu_id);
	}
	public List userIdQuery(String user_name) {	
		return adminsDao.userIdQuery(user_name);
	}

	@Override
	public List scores_show() {
		
		return adminsDao.scores_show();
	}
	@Override
	public void notice_delete(int new_id) {
		adminsDao.notice_delete(new_id);
		
	}
	@Override
	public List students_show() {
		
		return adminsDao.students_show();
	}
	@Override
	public void student_add(String stu_name,String stu_pwd,String stu_sex,String stu_date) {
		adminsDao.student_add(stu_name,stu_pwd,stu_sex,stu_date);
		
	}

	@Override
	public void student_delete(int stu_id) {
		adminsDao.student_delete(stu_id);
		
	}
	
	public List news_id_show(String new_id) {	
		return adminsDao.news_id_show(new_id);
	}
	public List notice_id_show(String new_id) {	
		return adminsDao.notice_id_show(new_id);
	}
	public List stu_name_array(){
		return adminsDao.stu_name_array();
	}
	public List score_array(){
		return adminsDao.score_array();
	}

}
