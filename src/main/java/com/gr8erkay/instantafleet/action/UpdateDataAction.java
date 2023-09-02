package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.CarDAO;
import com.gr8erkay.instantafleet.entity.Car;
import com.opensymphony.xwork2.ActionSupport;


public class UpdateDataAction extends ActionSupport{

	String productId;
	String productName;
	String productCategory;
	Integer productPrice;
	
	public String execute() {
		System.out.println("execute() method called");
		Car car = CarDAO.getProductById(productId);
		productId = car.getProductId();
		productName = car.getProductName();
		productCategory = car.getProductCategory();
		productPrice = car.getProductPrice();
		return "success";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
}
