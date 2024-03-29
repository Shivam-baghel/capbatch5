package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Product;

public class SaveProductDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductId(333);
		product.setProductName("NewProduct-1");
		product.setProductPrice(50000);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(product);
		System.out.println("Product saved");				
		em.getTransaction().commit();
		
		em.close();
		factory.close();

	}

}
