package com.cg.spingmvcjpa.dao;

import com.cg.spingmvcjpa.entity.Product;

public interface ProductDao {

	public void save(Product product);
	public Product getProductById(int productId);
}
