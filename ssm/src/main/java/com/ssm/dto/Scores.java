package com.ssm.dto;

public class Scores {
	private int score_id;
	private int stu_id;
	private int user_id;
	private int score;
	public int getScore_id() {
		return score_id;
	}
	public void setScore_id(int score_id) {
		this.score_id = score_id;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Scores [score_id=" + score_id + ", stu_id=" + stu_id + ", user_id=" + user_id + ", score=" + score
				+ "]";
	}
	
}
