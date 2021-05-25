package com.cg.jpademo.service;

import com.cg.jpademo.dao.ProductDao;
import com.cg.jpademo.entity.Product;

public class ProductService {

	private ProductDao productDao;
	
    public ProductService() {     	
    	productDao = new ProductDao();    	
    }
	
	public void saveProduct(Product product) {
		
		productDao.save(product);		
	}
	
	public Product findProductById(int productId) {
		
		return productDao.getProductById(productId);
	}
}
