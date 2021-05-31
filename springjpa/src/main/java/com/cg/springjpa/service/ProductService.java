package com.cg.springjpa.service;

import com.cg.springjpa.entity.Product;

public interface ProductService {
	
	public void saveProduct(Product product);
	public Product findProductById(int productId);

}
