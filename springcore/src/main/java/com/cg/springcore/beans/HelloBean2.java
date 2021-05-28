package com.cg.springcore.beans;

public class HelloBean2 {

	private String message;
	
	public HelloBean2(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Welcome: "+message);
	}
}
