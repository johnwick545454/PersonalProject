package com.infogain.ProductMgmt;

import java.util.Date;

public class Product {
	int productId;
	String Nane;
	int price;
	Date manDate;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getNane() {
		return Nane;
	}
	public void setNane(String nane) {
		Nane = nane;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getManDate() {
		return manDate;
	}
	public void setManDate(Date manDate) {
		this.manDate = manDate;
	}
	public Product(int productId, String nane, int price, Date manDate) {
		super();
		this.productId = productId;
		Nane = nane;
		this.price = price;
		this.manDate = manDate;
	}
	public Product() {
		super();
		
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", Nane=" + Nane + ", price=" + price + ", manDate=" + manDate + "]";
	}
	
	
}
