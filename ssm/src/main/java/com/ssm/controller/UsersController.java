package com.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ssm.dto.Scores;
import com.ssm.dto.Users;
import com.ssm.service.UsersService;

@Controller    
@RequestMapping("/users")    
public class UsersController {    
	@Resource
	private UsersService usersService;
	
//	用户展示
	@RequestMapping("/show_user")
	@ResponseBody
	public List show_user(){
		List list =usersService.show_user();
		System.out.println(list);
		return list;
	}

//	增加用户
	@RequestMapping("/add_user")
	@ResponseBody
	public void admins_adduser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		String user_pwd = users.getUser_pwd();
		usersService.admins_adduser(user_name,user_pwd);
	}
	
	
//	编辑用户
	@RequestMapping("/edit_user")
	@ResponseBody
	public void admins_edituser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		String user_pwd = users.getUser_pwd();
		usersService.admins_edituser(user_name,user_pwd);
	}
//	管理员登录
	@RequestMapping("/login")
	@ResponseBody
	public List userLogin(HttpServletRequest request ,Model model,@RequestBody Map<String,String> map){
		String user_name = map.get("user_name");
		String user_pwd = map.get("user_pwd");
		List login = usersService.userLogin(user_name,user_pwd);
       return login;
	}	
	
//	评分
	@RequestMapping("/user_score")
	@ResponseBody
	public void user_score(@RequestBody Scores scores){
		int stu_id = scores.getStu_id();
		int user_id = scores.getUser_id();
		int score = scores.getScore();
		usersService.user_score(stu_id,user_id,score);
	}
	 

}    
