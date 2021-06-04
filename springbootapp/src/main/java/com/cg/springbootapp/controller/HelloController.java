package com.cg.springbootapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootapp.bean.Employee;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String showMessage() {
		String message = "Welcome to Webservice";		
		return message;		
	}
	
	@GetMapping("/emp")
	public Employee getByIdEmp() {	
		
		Employee emp =new Employee(103,"Smith",50000);		
		return emp;		
	}
	
	@GetMapping("/getemps")
	public List<Employee> getAllEmps() {		
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(101,"Rohit",50000));
		emps.add(new Employee(102,"Sameer",50000));
		emps.add(new Employee(103,"Smith",50000));
		
		return emps;		
	}

}
