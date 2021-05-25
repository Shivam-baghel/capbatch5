package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Product;

public class FindProduct {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		Product product = em.find(Product.class, 2222);
		
		em.getTransaction().begin();
		
		if(product != null) {
			System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
		   // product.setProductPrice(55555); // database updated
		}
		else {
			System.out.println("Product not available");
		}
		em.getTransaction().commit();
		em.close();
		
		product.setProductPrice(1111111); // database is not updated
		
		
		
		factory.close();

	}

}
