package com.gr8erkay.instantafleet.entity;

public class Car {

    String ProductId;
    String ProductName;
    String ProductCategory;

    Integer ProductPrice;

    public Car(){
        //NoArgs Constructor
    }

    public Car(String productId, String productName, String productCategory, Integer productPrice) {

        //AllArgs Constructor
        ProductId = productId;
        ProductName = productName;
        ProductCategory = productCategory;
        ProductPrice = productPrice;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public Integer getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Integer productPrice) {
        ProductPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ProductId='" + ProductId + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", ProductCategory='" + ProductCategory + '\'' +
                ", ProductPrice=" + ProductPrice +
                '}';
    }
}
