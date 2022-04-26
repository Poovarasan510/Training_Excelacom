package com.example.demo.services;

public class ProductService {

public ProductService(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

@Override
public String toString() {
	return "ProductService [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
}

public ProductService() {
		super();
		
	}
private int productId;
private String productName;
private double price;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
	


	}


