package com.cg.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.springjpa.entity.Product;
import com.cg.springjpa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	public void saveProduct(Product product) {

		try {
			productService.saveProduct(product);
			System.out.println("Product saved");
		} catch (Exception e) {
			System.out.println("Somthing went wrong");
		}
	}

	public void getProductDetails(int productId) {

		Product product = productService.findProductById(productId);
		if(product != null) {
			System.out.println("Product Details");
			System.out.println("Product Id: "+product.getProductId());
			System.out.println("Product Name: "+product.getProductName());
			System.out.println("Product Price: "+product.getProductPrice());
		}
		else {
			System.out.println("Product not existing");
		}
	}

}
