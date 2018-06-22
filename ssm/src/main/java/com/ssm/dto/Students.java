package com.ssm.dto;

public class Students {
	private int stu_id;
	private String stu_name;
	private String stu_pwd;
	private String stu_sex;
	private String stu_date;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_pwd() {
		return stu_pwd;
	}
	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_date() {
		return stu_date;
	}
	public void setStu_date(String stu_date) {
		this.stu_date = stu_date;
	}
	@Override
	public String toString() {
		return "Students [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_pwd=" + stu_pwd + ", stu_sex=" + stu_sex
				+ ", stu_date=" + stu_date + "]";
	}
	
	
}
