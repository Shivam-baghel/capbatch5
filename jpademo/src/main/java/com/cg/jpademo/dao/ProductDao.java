package com.cg.jpademo.dao;

import javax.persistence.EntityManager;

import com.cg.jpademo.entity.Product;
import com.cg.jpademo.util.JpaUtil;

public class ProductDao {
	
	public void save(Product product) {
		
		EntityManager entityManager = JpaUtil.getEntityManager();		
		entityManager.getTransaction().begin();		
		entityManager.persist(product);		
		entityManager.getTransaction().commit();		
	}
	
	public Product getProductById(int productId) {
		EntityManager entityManager = JpaUtil.getEntityManager();	
		Product product = entityManager.find(Product.class, productId);
		return product;
	}
}
