package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.Util.Status;
import com.gr8erkay.instantafleet.dao.CarDAO;
import com.gr8erkay.instantafleet.dao.OfficeDAO;
import com.gr8erkay.instantafleet.dao.UserDAO;
import com.gr8erkay.instantafleet.entity.Car;
import com.gr8erkay.instantafleet.entity.Office;
import com.gr8erkay.instantafleet.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class ReservationFormAction extends ActionSupport {

    List<Office> offices;

    List<User> users;

    private List<Status> statusList;

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void initializeUsers()
    {
        users = UserDAO.getAllUsers();
    }
    public void initializeOffices(){
        offices = OfficeDAO.getAllOffices();
    }
    public void initializeStatus(){
        statusList = new ArrayList<>();
        for (Status status : Status.values()) {
            statusList.add(status);
        }
    }

    public String execute() {
        System.out.println("Welcome execute() method called");
        initializeUsers();
        initializeOffices();
        initializeStatus();
        System.out.println(users);
        System.out.println(offices);
        System.out.println(statusList);

        return SUCCESS;
    }
}
