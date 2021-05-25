package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Product;

public class UpdateProduct {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductId(2222);
		product.setProductName("Nokia");
		product.setProductPrice(60000);
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Product product1 = em.find(Product.class, product.getProductId());
		product1.setProductName(product.getProductName());
		product1.setProductPrice(product.getProductPrice());
		System.out.println("Product updated");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
