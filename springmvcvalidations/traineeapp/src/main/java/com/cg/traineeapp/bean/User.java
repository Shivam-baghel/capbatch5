package com.cg.traineeapp.bean;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters long.")
	private String username;
	private String password;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
