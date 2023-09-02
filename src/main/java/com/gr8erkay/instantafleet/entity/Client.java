package com.gr8erkay.instantafleet.entity;

public class Client {

    String clientId;
    String clientName;
    Contact contact;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public com.gr8erkay.instantafleet.entity.Contact getContact() {
        return contact;
    }

    public void setContact(com.gr8erkay.instantafleet.entity.Contact contact) {
        contact = contact;
    }


}
