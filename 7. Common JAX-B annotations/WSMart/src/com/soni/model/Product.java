package com.soni.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(name="Product")
@XmlType(propOrder={"manufactured", "name", "price"})
public class Product {
	private String name;
	private Double price;
	private Integer manufactured;
	
	public Product() {}
	
	public Product(String name, Double price, Integer manufactured) {
		this.name = name;
		this.price = price;
		this.manufactured = manufactured;
	}

	@XmlElement(name="productName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getManufactured() {
		return manufactured;
	}

	public void setManufactured(Integer manufactured) {
		this.manufactured = manufactured;
	}
	
}
