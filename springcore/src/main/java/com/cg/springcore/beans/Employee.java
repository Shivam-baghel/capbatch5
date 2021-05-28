package com.cg.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empId;
	private String name;
	
	@Qualifier("deptBean2")
	@Autowired
	private Department dept;	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public Department getDept() {
		return dept;
	}
	
	
	
	
	
	
}
