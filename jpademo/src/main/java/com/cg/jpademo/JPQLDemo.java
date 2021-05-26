package com.cg.jpademo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo {
	
	public static void main(String[] args) {		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		System.out.println("****** Select All Students ************");
		
		Query query = em.createQuery("Select s from Student s");
		List<Student> students = query.getResultList();
		students.forEach(s->System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getEmail()));
		
		System.out.println("****** Select name,email ************");
		
//		Query query2 = em.createQuery("Select s.studentName, s.email from Student s");
//		List<Student>  nameEmailList = query2.getResultList();
//		nameEmailList.forEach(s->System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getEmail()));
				
		TypedQuery<Student> query3 = em.createQuery("Select s from Student s",Student.class);
		List<Student> studentList  = query3.getResultList();
		studentList.forEach(s->System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getEmail()));
		
		System.out.println("****** Select Single Record (positional parameter) ************");
		Query query4 = em.createQuery("Select s from Student s where s.studentName = ?1");
		query4.setParameter(1, "newst3");
		Student student = (Student) query4.getSingleResult();
		System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getEmail());
		
		System.out.println("****** Select Single Record (Named parameter) ************");
		Query query5 = em.createQuery("Select s from Student s where s.studentName = :sname");
	    query5.setParameter("sname", "newst4");
		Student student2 = (Student) query5.getSingleResult();
		System.out.println(student2.getStudentId()+" "+student2.getStudentName()+" "+student2.getEmail());
		
		em.getTransaction().begin();
		System.out.println("****** Update Query************");
		Query query6 = em.createQuery("Update Employee e set e.salary = :esal where e.empNo = :eno");
		query6.setParameter("esal", 55000d);
		query6.setParameter("eno", 111);
		query6.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
		factory.close();		
		
	}
}
