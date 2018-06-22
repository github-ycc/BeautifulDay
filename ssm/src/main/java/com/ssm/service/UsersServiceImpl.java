package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UsersDao;


@Service("UsersService")
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersDao usersDao;
	
	@Override
	public void admins_adduser(String user_name, String user_pwd) {
		usersDao.admins_adduser(user_name, user_pwd);
	}
	
	@Override
	public void admins_edituser(String user_name, String user_pwd) {
		usersDao.admins_edituser(user_name, user_pwd);
		
	}

	@Override
	public List show_user() {
		return usersDao.show_user();
	}

	@Override
	public List userLogin(String user_name, String user_pwd) {
	
		return usersDao.userLogin(user_name);
	}

	@Override
	public void user_score(int stu_id, int user_id, int score) {
		usersDao.user_score(stu_id, user_id,score);
	}

}
