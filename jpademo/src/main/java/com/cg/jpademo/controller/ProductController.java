package com.cg.jpademo.controller;

import java.util.Scanner;

import com.cg.jpademo.entity.Product;
import com.cg.jpademo.service.ProductService;

public class ProductController {

public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("********* SAVE PRODUCT **********");
//		//save product		
//		System.out.println("Enter Product Id:");
//		int pId = sc.nextInt();
//		System.out.println("Enter Product Name:");
//		String pName = sc.next();
//		System.out.println("Enter Product Price:");
//		double price = sc.nextDouble();
//		
//		
//		
//		Product product = new Product();
//		product.setProductId(pId);
//		product.setProductName(pName);
//		product.setProductPrice(price);
//		
//		try {
//			productService.saveProduct(product);
//			System.out.println("Product saved");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("********* GET PRODUCT BY ID **********");
		//get product by id
		
		System.out.println("Enter Product Id:");
		int productId = sc.nextInt();
		
		Product product1 = productService.findProductById(productId);
		
		if(product1!= null) {
			System.out.println(product1.getProductId()+" "+product1.getProductName()+" "+product1.getProductPrice());
		}
		else {
			System.out.println("Product not available");
		}		
		
		sc.close();	
		
}
}
