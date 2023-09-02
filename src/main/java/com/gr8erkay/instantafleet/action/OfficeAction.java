package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.OfficeDAO;
import com.gr8erkay.instantafleet.dao.UserDAO;
import com.gr8erkay.instantafleet.entity.Office;
import com.gr8erkay.instantafleet.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class OfficeAction extends ActionSupport {
    private List<Office> offices;


    private String name;

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String execute() {
        // Create the office table if it doesn't exist
        OfficeDAO.createOfficeTable();
        Office office = new Office();
        office.setName(name);
        OfficeDAO.addOffice(office);

        // Populate the list of offices from the database
        offices = OfficeDAO.getAllOffices();

        return SUCCESS;
    }
    public String getOffice() {
        if (name != null && !name.isEmpty()) {
            Office office = OfficeDAO.getOfficeByName(name);
            if (office != null) {
                // Here, you can handle what you want to do with the retrieved user
                // For example, you could set some properties in the action and use them in the JSP
                return SUCCESS;
            } else {
                // User not found, handle accordingly (return an error result or show a message)
                return ERROR;
            }
        } else {
            // Handle empty or null username
            return ERROR;
        }
    }
}
