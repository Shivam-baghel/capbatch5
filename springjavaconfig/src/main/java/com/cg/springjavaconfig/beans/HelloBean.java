package com.cg.springjavaconfig.beans;

public class HelloBean {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Welcome: "+message);
	}
}
