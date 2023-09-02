package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.CarDAO;
import com.opensymphony.xwork2.ActionSupport;



public class DeleteAction extends ActionSupport{

	String productId;
	
	public String execute() {
		String statusCode = "";
		System.out.println("Delete execute() method called");
		System.out.println("Car Id = "+productId);
		int recordUpdated = CarDAO.deleteProduct(productId);
		if (recordUpdated == 1) {
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
}
