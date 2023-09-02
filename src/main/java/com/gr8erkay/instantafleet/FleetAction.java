package com.gr8erkay.instantafleet;

public class FleetAction {

    String message;
    String carBrand;
    public String execute() {
        System.out.println("execute() method called");
        message = "Success Message";
        carBrand = "Toyota";
        System.out.println("Car Brand " + carBrand);
        return "success";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
