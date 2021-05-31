package com.cg.springjpa;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springjpa.controller.ProductController;
import com.cg.springjpa.entity.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");		
		ProductController controller = context.getBean(ProductController.class);
			
		Scanner sc = new Scanner(System.in);		
		System.out.println("********* SAVE PRODUCT **********");
		//save product		
		System.out.println("Enter Product Id:");
		int pId = sc.nextInt();
		System.out.println("Enter Product Name:");
		String pName = sc.next();
		System.out.println("Enter Product Price:");
		double price = sc.nextDouble();	
		sc.close();
		
		Product product = new Product();
		product.setProductId(pId);
		product.setProductName(pName);
		product.setProductPrice(price);
		
		controller.saveProduct(product);		
		
		System.out.println("********* GET PRODUCT BY ID **********");
		
		controller.getProductDetails(103);		
		
		context.close();

	}

}
