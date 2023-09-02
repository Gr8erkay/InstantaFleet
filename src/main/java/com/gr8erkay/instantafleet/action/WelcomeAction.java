package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.CarDAO;
import com.gr8erkay.instantafleet.entity.Car;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class WelcomeAction extends ActionSupport {

    List<Car> cars;

    public void initializeProducts()
    {
        cars = CarDAO.getAllProducts();
    }

    public String execute() {
        System.out.println("Welcome execute() method called");
        initializeProducts();
        System.out.println(cars);

        CarDAO.createProductTable();
        return SUCCESS;
    }

    public List<Car> getProducts() {
        return cars;
    }

    public void setProducts(List<Car> cars) {
        this.cars = cars;
    }

}
