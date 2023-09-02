package com.gr8erkay.instantafleet.entity;

public class Contact {

    String contactId;
    String contactName;
    String email;

    String phoneNo;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    @Override
    public String toString() {
        return "Contact{" +
                "ContactId='" + contactId + '\'' +
                ", ContactName='" + contactName + '\'' +
                ", Email='" + email + '\'' +
                ", PhoneNo=" + phoneNo +
                '}';
    }
}
