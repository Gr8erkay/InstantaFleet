package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.Office;
import com.gr8erkay.instantafleet.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeDAO {

    public static List<Office> getAllOffices() {
        List<Office> offices = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtil.getConnections();
            String query = "SELECT * FROM office";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Office office = new Office();
                office.setName(resultSet.getString("name"));
                offices.add(office);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection);

        }
        return offices;
    }

    public static void addOffice(Office office) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtil.getConnections();
            String query = "INSERT INTO office (name)" + " VALUES (?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, office.getName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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

    public static Office getOfficeByName(String name) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Office office = null;
        try {
            connection = DBUtil.getConnections();
            String query = "SELECT * FROM office WHERE name = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                office = new Office();
                office.setName(resultSet.getString("name"));
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

        return office;
    }


    public static void createOfficeTable() {
        try {
            Connection conn = DBUtil.getConnections();
            Statement st = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS office (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(255) NOT NULL)";

            st.executeUpdate(createTableSQL);

            DBUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
