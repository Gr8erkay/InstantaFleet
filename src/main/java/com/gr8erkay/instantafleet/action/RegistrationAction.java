package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.UserDAO;
import com.gr8erkay.instantafleet.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class RegistrationAction extends ActionSupport {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private Integer approvalLimit;
    private List<User> users;

    public String execute() {
        UserDAO.createUsersTable();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhoneNo(phoneNo);
        user.setApprovalLimit(approvalLimit);

        UserDAO.saveUser(user);

        users = UserDAO.getAllUsers();

        return SUCCESS;
    }

    public String getUser() {
        if (username != null && !username.isEmpty()) {
            User user = UserDAO.getUserByUsername(username);
            if (user != null) {
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

    // Getters and setters for all parameters

    // ... (getters and setters for username, password, etc.)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getApprovalLimit() {
        return approvalLimit;
    }

    public void setApprovalLimit(Integer approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
