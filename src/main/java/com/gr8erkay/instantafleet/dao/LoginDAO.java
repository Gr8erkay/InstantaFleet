package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.LoginInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {

    public static boolean isUserValid(LoginInfo userDetails) {
        boolean validStatus = false;
        try {
            Connection connection = DBUtil.getConnections();
            Statement statement = connection.createStatement();
            System.out.println("Validating input data...");
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM users WHERE username = '" +
                            userDetails.getUserName() + "' AND password = '" +
                            userDetails.getPassword() + "'");
            System.out.println(userDetails.getUserName());
            System.out.println(userDetails.getPassword());

            while (resultSet.next()) {
                validStatus = true;
            }
            DBUtil.closeConnection(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return validStatus;
    }
}
