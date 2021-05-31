package com.cg.springjpa.dao;

import com.cg.springjpa.entity.Product;

public interface ProductDao {

	public void save(Product product);
	public Product getProductById(int productId);
}
