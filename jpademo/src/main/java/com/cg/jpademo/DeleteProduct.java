package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Product;

public class DeleteProduct {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		
		int productId = 333;
		
		Product product = em.find(Product.class, productId);
		
		em.getTransaction().begin();
		
		if(product!=null) {
			
			em.remove(product);
			System.out.println("Product deleted.");
		}
		else {
			System.out.println("Product Not available");
		}
		
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
