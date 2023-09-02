package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.LoginDAO;
import com.gr8erkay.instantafleet.entity.LoginInfo;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String userName;
    private String password;

    private LoginInfo userDetails; // Add this property


    public String execute() {
        userDetails = new LoginInfo(userName, password);
        System.out.println("Checking user details...");
        if (LoginDAO.isUserValid(userDetails)) {
            // Successful login, you can store user information in session or perform other logic
            System.out.println("verified user, Welcome!!!");
            return SUCCESS;
        } else {
            // Invalid login
            System.out.println("wrong details inputted, kindly verify and input correct details.");
            return INPUT;
        }
    }

    // Getters and setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
