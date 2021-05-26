package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyDemo {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStudentId(111);
		st1.setStudentName("newst1");
		st1.setEmail("newst1@tamil.com");
		
		Student st2 = new Student();
		st2.setStudentId(222);
		st2.setStudentName("newst2");
		st2.setEmail("newst2@tamil.com");	
		
		Student st3 = new Student();
		st3.setStudentId(333);
		st3.setStudentName("newst3");
		st3.setEmail("newst3@tamil.com");	
		
		Student st4 = new Student();
		st4.setStudentId(444);
		st4.setStudentName("newst4");
		st4.setEmail("newst4@tamil.com");	
		
		Course course1 = new Course();
		course1.setCourseId(10);
		course1.setCourseName("Java");
		course1.setDuration(2);
		course1.setFees(5000);
		
		course1.addStudent(st1);
		course1.addStudent(st2);
		
//		Course course2 = new Course();
//		course2.setCourseId(20);
//		course2.setCourseName("spring");
//		course2.setDuration(3);
//		course2.setFees(7000);
//		
//		course2.addStudent(st3);
//		course2.addStudent(st4);	
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(course1);
		//em.persist(course2);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
