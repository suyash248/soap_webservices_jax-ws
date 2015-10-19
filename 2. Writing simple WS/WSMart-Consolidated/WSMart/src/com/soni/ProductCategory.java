package com.soni;

import java.util.List;

import javax.jws.WebService;

import com.soni.service.ProductServiceImpl;

@WebService
public class ProductCategory {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	public List<String> getProductByCategory(String category) {
		return productService.getProductByCategory(category);
	}
	
	public boolean addProductToCategory(String category, String product) {
		return productService.addProductToCategory(category, product);
	}
}
