package com.cg.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.controller.EmployeeController;
import com.cg.springjavaconfig.config.EmpConfiguration;
import com.cg.springjavaconfig.config.MyConfiguration;

public class EmployeeControllerMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfiguration.class);
		
		EmployeeController empController = (EmployeeController) context.getBean(EmployeeController.class);
		
		empController.createEmployeeMethod();
		
		context.close();
	}

}
