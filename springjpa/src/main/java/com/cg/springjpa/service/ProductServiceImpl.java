package com.cg.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springjpa.dao.ProductDao;
import com.cg.springjpa.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Transactional
	@Override
	public void saveProduct(Product product) {		
		productDao.save(product);		
	}

	@Override
	public Product findProductById(int productId) {		
		return productDao.getProductById(productId);
	}

}
