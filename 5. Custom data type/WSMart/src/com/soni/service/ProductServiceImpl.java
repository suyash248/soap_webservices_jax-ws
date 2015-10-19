package com.soni.service;

import java.util.ArrayList;
import java.util.List;

import com.soni.model.Product;

public class ProductServiceImpl {
	
	private List<String> bookList = new ArrayList<String>();
	private List<String> musicList = new ArrayList<String>();
	private List<String> moviesList = new ArrayList<String>();
	
	// Initializing data.
	public ProductServiceImpl() {
		bookList.add("Head First");
		bookList.add("Black Book");
		bookList.add("Complete Reference");
		
		musicList.add("Somebody's me");
		musicList.add("Hero");
		musicList.add("Here I Am");
		
		moviesList.add("Spiderman");
		moviesList.add("Harrypotter");
		moviesList.add("Inception");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProductByCategory(String category) {
		switch(category) {
			case "Books" :
				return bookList;
			case "Music" :
				return musicList;
			case "Movies" :
				return moviesList;
			default :
				return null;
		}
	}
	
	public boolean addProductToCategory(String category, String product){
		switch(category) {
			case "Books" :
				bookList.add(product);
				return true;
			case "Music" :
				musicList.add(product);
				return true;
			case "Movies" :
				moviesList.add(product);
				return true;
			default :
				return false;
		}
	}
	
	public List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product("Spring In Action", 938.09, 1998));
		productList.add(new Product("Spring Pro", 898.79, 2000));
		
		return productList;
	}
	
}
