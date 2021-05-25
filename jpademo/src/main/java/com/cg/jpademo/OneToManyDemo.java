package com.cg.jpademo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyDemo {

	public static void main(String[] args) {
		
		
		
		
		Department department = new Department();
		department.setDeptId(10);
		department.setDeptName("IT");
		
		Employee emp1 = new Employee();
		emp1.setEmpNo(111);
		emp1.setName("Rohit");
		emp1.setSalary(45000);
		emp1.setDept(department);
		
		Employee emp2 = new Employee();
		emp2.setEmpNo(222);
		emp2.setName("Sachin");
		emp2.setSalary(65000);
		emp2.setDept(department);
		
		Set<Employee> empSet = department.getEmployees();
		empSet.add(emp1);
		empSet.add(emp2);
		
		department.setEmployees(empSet);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(department);
		
		System.out.println("Dept and emps data saved.");		
		
		em.getTransaction().commit();
		em.clear();
		factory.close();

	}

}
