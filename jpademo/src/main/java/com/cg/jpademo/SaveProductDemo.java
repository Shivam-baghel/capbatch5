package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveProductDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductId(2222);
		product.setProductName("JPA Product");
		product.setProductPrice(80000);
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(product);
		System.out.println("Product is saved.");
		
		em.getTransaction().commit();		
		
		em.close();
		factory.close();

	}

}
