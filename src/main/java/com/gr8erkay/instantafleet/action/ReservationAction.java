package com.gr8erkay.instantafleet.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.gr8erkay.instantafleet.entity.Reservation;
import com.gr8erkay.instantafleet.dao.ReservationDAO;

public class ReservationAction extends ActionSupport {

    private Reservation reservation;

    private String office;
    private String owner;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String clientType;
    private String creditType;
    private String phoneNo;
    private String email;
    private String remark;
    private String comments;

    // Getter and setter methods for reservations and reservation

    public String execute() {
        ReservationDAO.createReservationsTable();

        Reservation newReservation = new Reservation();
        // Set properties of the newReservation object here using setters
        System.out.println("Office: " + office);
        System.out.println("Owner: " + owner);
        System.out.println("Status: " + status);
        newReservation.setOffice(office);
        newReservation.setOwner(owner);
        newReservation.setClientType(clientType);
        newReservation.setCreditType(creditType);
        newReservation.setStatus(status);
        newReservation.setPhoneNo(phoneNo);
        newReservation.setEmail(email);
        newReservation.setRemark(remark);
        newReservation.setComments(comments);

        ReservationDAO.createReservation(newReservation);


        return SUCCESS;
    }


    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
