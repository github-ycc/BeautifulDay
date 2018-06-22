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

import com.ssm.dto.Admins;
import com.ssm.dto.News;
import com.ssm.dto.Students;
import com.ssm.dto.Users;
import com.ssm.service.AdminsService;

@Controller     
@RequestMapping("/admins")    
public class AdminsController {   
	private String fileName;
	@Resource
	private AdminsService adminsService;
//	管理员登录
	@RequestMapping("/login")
	@ResponseBody
	public List admins_login(HttpServletRequest request ,Model model,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String admin_pwd = map.get("admin_pwd");
		List login = adminsService.adminLogin(admin_name,admin_pwd);
       return login;
	}
//	管理员展示
	@RequestMapping("/admins_show")
	@ResponseBody
	public List admins_show(){
		return adminsService.admins_show();
	}
//	增加管理员
	@RequestMapping("/admins_add")
	@ResponseBody
	public void admins_add(@RequestBody Admins admins){
		String admin_name = admins.getAdmin_name();
		String admin_pwd = admins.getAdmin_pwd();
		String admin_grade = admins.getAdmin_grade();
		adminsService.admins_add(admin_name,admin_pwd,admin_grade);
	}
	
//	删除用户
	@RequestMapping("/delete_user")
	@ResponseBody
	public void admins_deleteuser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		adminsService.admins_deleteuser(user_name);
	}   
	
/*//	编辑用户
	@RequestMapping("/edit_user")
	@ResponseBody
	public void admins_edituser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		String user_pwd = users.getUser_pwd();
		adminsService.admins_edituser(user_name,user_pwd);
	}*/
	

//	删除管理员
	@RequestMapping("/delete_admins")
	@ResponseBody
	public void delete_admins(@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		adminsService.delete_admins(admin_name);
	} 
	
//	管理员修改密码
	@RequestMapping("/edit_admins")
	@ResponseBody
	public void edit_admins(HttpServletRequest request ,Model model, @RequestBody Admins admins){
		String admins_name = admins.getAdmin_name();
		String admins_pwd = admins.getAdmin_pwd();
		System.out.println(admins_name);
		System.out.println(admins_pwd);
		adminsService.edit_admins(admins_name,admins_pwd);
	}   	
	
//	最新通知管理           添加
	@RequestMapping("/notice")
	@ResponseBody
	public void admins_notice(HttpServletRequest request ,Model model,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String notice_title = map.get("notice_title");
		String notice_information = map.get("notice_information");
		String notice_date = map.get("notice_date");
		adminsService.admins_notice(admin_name,notice_title, notice_information, notice_date);
	}
	
//	就业快讯管理           添加
	@RequestMapping(value="/news",method = RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public void admins_news(HttpServletRequest request,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String new_title = map.get("new_title");
		String new_information = map.get("new_information");
		String new_date = map.get("new_date");
		adminsService.admins_news(admin_name,new_title,new_information,new_date,fileName);
		
	}

	//	最新通知管理/新闻           页面展示
	@RequestMapping("/notice_show")
	@ResponseBody
	public List notice_show(HttpServletRequest request){
		List list =adminsService.notice_show();
		return list;
	}
//	学生查询name
	@RequestMapping("/studentIdQuery")
	@ResponseBody
	public List studentIdQuery(@RequestBody Map<String,String> map){
		String stu_id = map.get("stu_id");
		return adminsService.studentIdQuery(stu_id);
	}
//	用户name查询id
	@RequestMapping("/userIdQuery")
	@ResponseBody
	public List userIdQuery(@RequestBody Map<String,String> map){
		String user_name = map.get("user_name");
		return adminsService.userIdQuery(user_name);
	}
//	打分记录展示
	@RequestMapping("/scores_show")
	@ResponseBody
	public List scores_show(){
		return adminsService.scores_show();
	}
	
//	删除  最新通知管理   
	@RequestMapping("/notice_delete")
	@ResponseBody
	public void notice_delete(@RequestBody News news){
		int new_id = news.getNew_id();
		adminsService.notice_delete(new_id);
	} 
//	学生展示
	@RequestMapping("/students_show")
	@ResponseBody
	public List students_show(){
		return adminsService.students_show();
	}
//	增加学生
	@RequestMapping("/student_add")
	@ResponseBody
	public void student_add(@RequestBody Map<String,String> map){
		String stu_name = map.get("stu_name");
		String stu_pwd = map.get("stu_pwd");
		String stu_sex = map.get("stu_sex");
		String stu_date = map.get("stu_date");
		adminsService.student_add(stu_name,stu_pwd,stu_sex,stu_date);
	}
	
//	删除学生
	@RequestMapping("/student_delete")
	@ResponseBody
	public void student_delete(@RequestBody Students students){
		int stu_id = students.getStu_id();
		adminsService.student_delete(stu_id);
	} 
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)  
    @ResponseBody  
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException{  
        String path = request.getSession().getServletContext().getRealPath("upload");  
         fileName = file.getOriginalFilename();//获取到上传文件的名字
        //System.out.println(file.getName()+"2222");获取到file
        //file.getSize();获取到上传文件的大小
        File dir = new File(path,fileName);
        System.out.println(file.getSize());
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        //MultipartFile自带的解析方法  
        file.transferTo(dir);  
        System.out.println(path);
        System.out.println("/upload"+"/"+fileName);
        return "/upload"+"/"+fileName;  
    } 
	
//	新闻详情查询
	@RequestMapping("/news_id_show")
	@ResponseBody
	public List news_id_show(@RequestBody Map<String,String> map){
		String new_id = map.get("new_id");
		return adminsService.news_id_show(new_id);
	}
//	通知详情查询
	@RequestMapping("/notice_id_show")
	@ResponseBody
	public List notice_id_show(@RequestBody Map<String,String> map){
		String new_id = map.get("new_id");
		return adminsService.notice_id_show(new_id);
	}
//	数据分析查询学生姓名
	@RequestMapping("/stu_name_array")
	@ResponseBody
	public List stu_name_array(){
		return adminsService.stu_name_array();
	}
	
//	数据分析查询学生成绩
	@RequestMapping("/score_array")
	@ResponseBody
	public List score_array(){
		System.out.println(adminsService.score_array());
		return adminsService.score_array();
	}
}    
