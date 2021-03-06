package com.soni;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soni.model.Product;
import com.soni.service.ProductServiceImpl;

@WebService(serviceName="WSMartService", name="WSMart", portName="WSMartPort", targetNamespace="www.wsmart.com")
public class ProductCatalog {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod(action="WSMartGetCategoriesAction", operationName="getWSMartCategories")
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProductByCategory(String category) {
		return productService.getProductByCategory(category);
	}
	
	@WebMethod
	public boolean addProductToCategory(String category, String product) {
		return productService.addProductToCategory(category, product);
	}
	
	@WebMethod
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}
