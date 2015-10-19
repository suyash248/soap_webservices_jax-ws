package com.soni;

import java.util.List;

import javax.jws.WebService;

import com.soni.model.Product;
import com.soni.service.ProductServiceImpl;

@WebService(endpointInterface="com.soni.ProductCatalogSEI", serviceName="WSMartService", name="WSMart", portName="WSMartPort",
			targetNamespace="www.wsmart.com")
public class ProductCatalog implements ProductCatalogSEI {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProductByCategory(String category) {
		return productService.getProductByCategory(category);
	}
	
	@Override
	public boolean addProductToCategory(String category, String product) {
		return productService.addProductToCategory(category, product);
	}
	
	@Override
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}
