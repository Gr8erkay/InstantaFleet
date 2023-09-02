package com.gr8erkay.instantafleet.entity;

import com.gr8erkay.instantafleet.Util.Status;

public class Reservation {

    private String office;
    private String owner;

    private String clientType;
    private String creditType;
    private String status;

    private String phoneNo;
    private String email;
    private String remark;
    private String comments;

    // Getters and setters for properties


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "office=" + office +
                ", owner=" + owner +
                ", clientType='" + clientType + '\'' +
                ", creditType='" + creditType + '\'' +
                ", status=" + status +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", remark='" + remark + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
