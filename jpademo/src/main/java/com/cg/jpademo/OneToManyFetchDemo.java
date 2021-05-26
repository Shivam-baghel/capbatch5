package com.cg.jpademo;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyFetchDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		Department department = em.find(Department.class, 10);
		
		System.out.println("DeptId:"+department.getDeptId());
		System.out.println("Dept Name:"+department.getDeptName());
		
		Set<Employee> employees = department.getEmployees();
		
		employees.forEach(emp->System.out.println(emp.getEmpNo()+" "+emp.getName()+" "+emp.getSalary()));
		
		
		em.close();
		factory.close();

	}

}
