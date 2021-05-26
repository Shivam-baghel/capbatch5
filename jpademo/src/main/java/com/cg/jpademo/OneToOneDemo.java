package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student st1 = new Student();
		st1.setStudentId(111);
		st1.setStudentName("newst1");
		st1.setEmail("newst1@tamil.com");
		
		Address address = new Address();
		address.setAddressId(1111);
		address.setHouseNo("12/90-1");
		address.setCity("Noida");
		address.setPincode("986532");
		address.setStudent(st1);
		
		st1.setMailingAddress(address);
		
		em.persist(st1);	
		System.out.println("Saved.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
