package com.cg.springcore.dao;

import org.springframework.stereotype.Repository;

import com.cg.springcore.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee createNewEmployee() {
		
		Employee emp = new Employee();
		emp.setEmpId(111);
		emp.setFirstName("Rohit");
		emp.setLastName("Sharma");
		
		return emp;
	}

}
