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
//	����Ա��¼
	@RequestMapping("/login")
	@ResponseBody
	public List admins_login(HttpServletRequest request ,Model model,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String admin_pwd = map.get("admin_pwd");
		List login = adminsService.adminLogin(admin_name,admin_pwd);
       return login;
	}
//	����Աչʾ
	@RequestMapping("/admins_show")
	@ResponseBody
	public List admins_show(){
		return adminsService.admins_show();
	}
//	���ӹ���Ա
	@RequestMapping("/admins_add")
	@ResponseBody
	public void admins_add(@RequestBody Admins admins){
		String admin_name = admins.getAdmin_name();
		String admin_pwd = admins.getAdmin_pwd();
		String admin_grade = admins.getAdmin_grade();
		adminsService.admins_add(admin_name,admin_pwd,admin_grade);
	}
	
//	ɾ���û�
	@RequestMapping("/delete_user")
	@ResponseBody
	public void admins_deleteuser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		adminsService.admins_deleteuser(user_name);
	}   
	
/*//	�༭�û�
	@RequestMapping("/edit_user")
	@ResponseBody
	public void admins_edituser(HttpServletRequest request ,Model model, @RequestBody Users users){
		String user_name = users.getUser_name();
		String user_pwd = users.getUser_pwd();
		adminsService.admins_edituser(user_name,user_pwd);
	}*/
	

//	ɾ������Ա
	@RequestMapping("/delete_admins")
	@ResponseBody
	public void delete_admins(@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		adminsService.delete_admins(admin_name);
	} 
	
//	����Ա�޸�����
	@RequestMapping("/edit_admins")
	@ResponseBody
	public void edit_admins(HttpServletRequest request ,Model model, @RequestBody Admins admins){
		String admins_name = admins.getAdmin_name();
		String admins_pwd = admins.getAdmin_pwd();
		System.out.println(admins_name);
		System.out.println(admins_pwd);
		adminsService.edit_admins(admins_name,admins_pwd);
	}   	
	
//	����֪ͨ����           ���
	@RequestMapping("/notice")
	@ResponseBody
	public void admins_notice(HttpServletRequest request ,Model model,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String notice_title = map.get("notice_title");
		String notice_information = map.get("notice_information");
		String notice_date = map.get("notice_date");
		adminsService.admins_notice(admin_name,notice_title, notice_information, notice_date);
	}
	
//	��ҵ��Ѷ����           ���
	@RequestMapping(value="/news",method = RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public void admins_news(HttpServletRequest request,@RequestBody Map<String,String> map){
		String admin_name = map.get("admin_name");
		String new_title = map.get("new_title");
		String new_information = map.get("new_information");
		String new_date = map.get("new_date");
		adminsService.admins_news(admin_name,new_title,new_information,new_date,fileName);
		
	}

	//	����֪ͨ����/����           ҳ��չʾ
	@RequestMapping("/notice_show")
	@ResponseBody
	public List notice_show(HttpServletRequest request){
		List list =adminsService.notice_show();
		return list;
	}
//	ѧ����ѯname
	@RequestMapping("/studentIdQuery")
	@ResponseBody
	public List studentIdQuery(@RequestBody Map<String,String> map){
		String stu_id = map.get("stu_id");
		return adminsService.studentIdQuery(stu_id);
	}
//	�û�name��ѯid
	@RequestMapping("/userIdQuery")
	@ResponseBody
	public List userIdQuery(@RequestBody Map<String,String> map){
		String user_name = map.get("user_name");
		return adminsService.userIdQuery(user_name);
	}
//	��ּ�¼չʾ
	@RequestMapping("/scores_show")
	@ResponseBody
	public List scores_show(){
		return adminsService.scores_show();
	}
	
//	ɾ��  ����֪ͨ����   
	@RequestMapping("/notice_delete")
	@ResponseBody
	public void notice_delete(@RequestBody News news){
		int new_id = news.getNew_id();
		adminsService.notice_delete(new_id);
	} 
//	ѧ��չʾ
	@RequestMapping("/students_show")
	@ResponseBody
	public List students_show(){
		return adminsService.students_show();
	}
//	����ѧ��
	@RequestMapping("/student_add")
	@ResponseBody
	public void student_add(@RequestBody Map<String,String> map){
		String stu_name = map.get("stu_name");
		String stu_pwd = map.get("stu_pwd");
		String stu_sex = map.get("stu_sex");
		String stu_date = map.get("stu_date");
		adminsService.student_add(stu_name,stu_pwd,stu_sex,stu_date);
	}
	
//	ɾ��ѧ��
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
         fileName = file.getOriginalFilename();//��ȡ���ϴ��ļ�������
        //System.out.println(file.getName()+"2222");��ȡ��file
        //file.getSize();��ȡ���ϴ��ļ��Ĵ�С
        File dir = new File(path,fileName);
        System.out.println(file.getSize());
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        //MultipartFile�Դ��Ľ�������  
        file.transferTo(dir);  
        System.out.println(path);
        System.out.println("/upload"+"/"+fileName);
        return "/upload"+"/"+fileName;  
    } 
	
//	���������ѯ
	@RequestMapping("/news_id_show")
	@ResponseBody
	public List news_id_show(@RequestBody Map<String,String> map){
		String new_id = map.get("new_id");
		return adminsService.news_id_show(new_id);
	}
//	֪ͨ�����ѯ
	@RequestMapping("/notice_id_show")
	@ResponseBody
	public List notice_id_show(@RequestBody Map<String,String> map){
		String new_id = map.get("new_id");
		return adminsService.notice_id_show(new_id);
	}
//	���ݷ�����ѯѧ������
	@RequestMapping("/stu_name_array")
	@ResponseBody
	public List stu_name_array(){
		return adminsService.stu_name_array();
	}
	
//	���ݷ�����ѯѧ���ɼ�
	@RequestMapping("/score_array")
	@ResponseBody
	public List score_array(){
		System.out.println(adminsService.score_array());
		return adminsService.score_array();
	}
}    
