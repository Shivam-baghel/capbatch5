package com.cg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.controller.EmployeeController;

public class EmployeeControllerMain {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeecontext.xml");
		
		EmployeeController empController = (EmployeeController) context.getBean(EmployeeController.class);
		
		empController.createEmployeeMethod();
		
		context.close();

	}

}
