package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springcore.dao.EmployeeDao;
import com.cg.springcore.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	
//	public void setEmpDao(EmployeeDao empDao) {
//		this.empDao = empDao;
//	}

	@Override
	public Employee saveNewEmployee() {
	
		//validation logic , other logic etc.
		Employee emp = empDao.createNewEmployee();
		return emp;
	}

}
