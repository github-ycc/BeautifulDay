package com.ssm.dto;

public class News {
	private int new_id;
	private int admin_id;
	private String admin_name;
	private String new_title;
	private String new_information;
	private String new_date;
	private String new_photo;
	private String notice_title;
	private String notice_information;
	private String notice_date;
	private String notice_photo;
	private String question_title;
	private String question_information;
	private String question_grade;
	public int getNew_id() {
		return new_id;
	}
	public void setNew_id(int new_id) {
		this.new_id = new_id;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getNew_title() {
		return new_title;
	}
	public void setNew_title(String new_title) {
		this.new_title = new_title;
	}
	public String getNew_information() {
		return new_information;
	}
	public void setNew_information(String new_information) {
		this.new_information = new_information;
	}
	public String getNew_date() {
		return new_date;
	}
	public void setNew_date(String new_date) {
		this.new_date = new_date;
	}
	public String getNew_photo() {
		return new_photo;
	}
	public void setNew_photo(String new_photo) {
		this.new_photo = new_photo;
	}
	public String getQuestion_title() {
		return question_title;
	}
	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}
	public String getQuestion_information() {
		return question_information;
	}
	public void setQuestion_information(String question_information) {
		this.question_information = question_information;
	}
	public String getQuestion_grade() {
		return question_grade;
	}
	public void setQuestion_grade(String question_grade) {
		this.question_grade = question_grade;
	}
	
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_information() {
		return notice_information;
	}
	public void setNotice_information(String notice_information) {
		this.notice_information = notice_information;
	}
	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
	public String getNotice_photo() {
		return notice_photo;
	}
	public void setNotice_photo(String notice_photo) {
		this.notice_photo = notice_photo;
	}
	
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	@Override
	public String toString() {
		return "News [new_id=" + new_id + ", admin_id=" + admin_id + ", admin_name=" + admin_name + ", new_title="
				+ new_title + ", new_information=" + new_information + ", new_date=" + new_date + ", new_photo="
				+ new_photo + ", notice_title=" + notice_title + ", notice_information=" + notice_information
				+ ", notice_date=" + notice_date + ", notice_photo=" + notice_photo + ", question_title="
				+ question_title + ", question_information=" + question_information + ", question_grade="
				+ question_grade + ", getNew_id()=" + getNew_id() + ", getAdmin_id()=" + getAdmin_id()
				+ ", getNew_title()=" + getNew_title() + ", getNew_information()=" + getNew_information()
				+ ", getNew_date()=" + getNew_date() + ", getNew_photo()=" + getNew_photo() + ", getQuestion_title()="
				+ getQuestion_title() + ", getQuestion_information()=" + getQuestion_information()
				+ ", getQuestion_grade()=" + getQuestion_grade() + ", getNotice_title()=" + getNotice_title()
				+ ", getNotice_information()=" + getNotice_information() + ", getNotice_date()=" + getNotice_date()
				+ ", getNotice_photo()=" + getNotice_photo() + ", getAdmin_name()=" + getAdmin_name() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
