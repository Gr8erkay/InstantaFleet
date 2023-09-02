package com.gr8erkay.instantafleet.action;

import com.gr8erkay.instantafleet.dao.ContactDAO;
import com.gr8erkay.instantafleet.entity.Contact;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
public class ContactAction extends ActionSupport {

    private String contactName;
    private String email;

    private String phoneNo;


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
    private List<Contact> contacts;


    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }



    public String execute() {
        ContactDAO.createContactTable();
        Contact contact = new Contact();
        contact.setContactName(contactName);
        contact.setEmail(email);
        contact.setPhoneNo(phoneNo);

        ContactDAO.saveContact(contact);

        contacts = ContactDAO.getAllContacts();

         return SUCCESS;
    }

    public String getContact() {
        if (contactName != null && !contactName.isEmpty()) {
            Contact contact = ContactDAO.getContactByContactName(contactName);
            if (contact != null) {
                // Here, you can handle what you want to do with the retrieved contact
                // For example, you could set some properties in the action and use them in the JSP
                return SUCCESS;
            } else {
                // Contact not found, handle accordingly (return an error result or show a message)
                return ERROR;
            }
        } else {
            // Handle empty or null contactName
            return ERROR;
        }
    }
}
