package com.cg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.beans.Department;
import com.cg.springcore.beans.Employee;

public class EmployeeDeptMain {

	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee emp1 = (Employee) context.getBean("emp2");
		
		System.out.println("Employee Details:");
		System.out.println("Employee Id:"+emp1.getEmpId());
		System.out.println("Employee Name:"+emp1.getName());
		System.out.println("Employe Department Details");
		Department dept = emp1.getDept();
		System.out.println("Dept Id:"+dept.getDeptId());
		System.out.println("Dept Name:"+dept.getDeptName());
		
		context.close();
		

	}

}
