package com.cg.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.springcore.dto.Employee;
import com.cg.springcore.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	
//	public void setEmpService(EmployeeService empService) {
//		this.empService = empService;
//	}
	
	public void createEmployeeMethod() {		
		Employee emp = empService.saveNewEmployee();		
		System.out.println("New Employee is created");		
		System.out.println("Employee Details:");	
		System.out.println(emp.getEmpId()+ " "+emp.getFirstName()+" "+emp.getLastName());			
	}
}
