package com.ssm.dto;

public class Users {
	 	private int user_id;    
	    
	    private String user_name;    
	    
	    private String user_pwd;

		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getUser_pwd() {
			return user_pwd;
		}

		public void setUser_pwd(String user_pwd) {
			this.user_pwd = user_pwd;
		}

		@Override
		public String toString() {
			return "Users [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + "]";
		}    
	    
	      
	    
}
