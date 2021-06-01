package com.cg.spingmvcjpa.service;

import com.cg.spingmvcjpa.entity.Product;

public interface ProductService {
	
	public void saveProduct(Product product);
	public Product findProductById(int productId);

}
