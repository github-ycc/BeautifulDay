package com.ssm.dto;

public class Admins {
	private int admins_id;
	private String admin_name;
	private String admin_pwd;
	private String admin_grade;
	public int getAdmins_id() {
		return admins_id;
	}
	public void setAdmins_id(int admins_id) {
		this.admins_id = admins_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public String getAdmin_grade() {
		return admin_grade;
	}
	public void setAdmin_grade(String admin_grade) {
		this.admin_grade = admin_grade;
	}
	@Override
	public String toString() {
		return "Admins [admins_id=" + admins_id + ", admin_name=" + admin_name + ", admin_pwd=" + admin_pwd
				+ ", admin_grade=" + admin_grade + "]";
	}
	

}
