package com.cg.spingmvcjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.spingmvcjpa.entity.Product;
import com.cg.spingmvcjpa.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/productform")
	public String addProductForm() {
		
		return "productform";
	}	
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product, Model model) {
		
		productService.saveProduct(product);
		
		model.addAttribute("product", product);
		
		return "product-result";
	}
	

}
