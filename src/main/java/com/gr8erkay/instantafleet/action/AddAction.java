package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.CarDAO;
import com.gr8erkay.instantafleet.entity.Car;
import com.opensymphony.xwork2.ActionSupport;



public class AddAction extends ActionSupport{

	String productId;
	String productName;
	String productCategory;
	Integer productPrice;
	
	public String execute() {
		String statusCode = "";
		System.out.println("execute() method called");
		Car car = new Car(productId, productName, productCategory, productPrice);
		int recordAdded = CarDAO.addProduct(car);
		if (recordAdded == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
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
