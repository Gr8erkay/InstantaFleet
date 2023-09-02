package com.gr8erkay.instantafleet.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnections() {
        Connection connection = null;
        try {
            System.out.println("Connecting to the database...");

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/fleetDB";
            String username = "root";
            String password = "pa$$w0rd";

            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database successfully.");
            // You can perform database operations here

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
