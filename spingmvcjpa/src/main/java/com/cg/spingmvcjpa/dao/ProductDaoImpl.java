package com.cg.spingmvcjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.spingmvcjpa.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void save(Product product) {		
		entityManager.persist(product);		
	}

	@Override
	public Product getProductById(int productId) {	
		Product product = entityManager.find(Product.class, productId);
		return product;
	}

}
