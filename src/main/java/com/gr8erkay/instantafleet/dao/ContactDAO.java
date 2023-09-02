package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO {

    public static void saveContact(Contact contact) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DBUtil.getConnections();
            String query = "INSERT INTO contact (contact_name, email, phone_no) " +
                    "VALUES (?, ?, ?)";
            System.out.println(contact.getContactName());
            System.out.println(contact.getEmail());
            System.out.println(contact.getPhoneNo());
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, contact.getContactName());
            preparedStatement.setString(2, contact.getEmail());
            preparedStatement.setString(3, contact.getPhoneNo());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Contact getContactByContactName(String contactName) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Contact contact = null;

        try {
            connection = DBUtil.getConnections();
            String query = "SELECT * FROM contact WHERE contact_name = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, contactName);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                contact = new Contact();
                contact.setContactName(resultSet.getString("contact_name"));
                contact.setEmail(resultSet.getString("email"));
                contact.setPhoneNo(resultSet.getString("phone_no"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return contact;
    }

    public static void createContactTable() {
        try {
            Connection conn = DBUtil.getConnections();
            Statement st = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS contact (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "contact_name VARCHAR(255), " +
                    "email VARCHAR(255), " +
                    "phone_no VARCHAR(50))";

            st.executeUpdate(createTableSQL);

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBUtil.getConnections();
            String query = "SELECT * FROM contact";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Contact contact = new Contact();
                contact.setContactName(resultSet.getString("contact_name"));
                contact.setEmail(resultSet.getString("email"));
                contact.setPhoneNo(resultSet.getString("phone_no"));
                contacts.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection);
            // ... (closing preparedStatement and resultSet)
        }
        return contacts;
    }
}
