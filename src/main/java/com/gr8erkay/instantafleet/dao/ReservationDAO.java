package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.Reservation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAO {




    public static void createReservation(Reservation reservation)  {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = DBUtil.getConnections();

            String sql = "INSERT INTO reservations (office, owner, client_type, credit_type, phone_no, email, remark, comments, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            System.out.println(reservation.getClientType());
            System.out.println(reservation.getOwner());
            System.out.println(reservation.getOffice());
            System.out.println(reservation.getStatus());
            System.out.println("....working 01");

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, reservation.getOffice());
                statement.setString(2, reservation.getOwner());
                statement.setString(3, reservation.getClientType());
                statement.setString(4, reservation.getCreditType());
                statement.setString(5, reservation.getPhoneNo());
                statement.setString(6, reservation.getEmail());
                statement.setString(7, reservation.getRemark());
                statement.setString(8, reservation.getComments());
                statement.setString(9, reservation.getStatus());
            System.out.println("....working 02");

                statement.executeUpdate();

        }catch (SQLException e) {
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

    public static void createReservationsTable() {
        try {
            Connection conn = DBUtil.getConnections();
            Statement st = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS reservations (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "office VARCHAR(255), " +
                    "owner VARCHAR(255), " +
                    "client_type VARCHAR(255), " +
                    "credit_type VARCHAR(255), " +
                    "phone_no VARCHAR(20), " +
                    "email VARCHAR(255), " +
                    "remark VARCHAR(255), " +
                    "comments VARCHAR(255), " +
                    "status VARCHAR(50))";

            st.executeUpdate(createTableSQL);

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Reservation getReservationById(int reservationId) {
        Reservation reservation = null;

        try {
            Connection conn = DBUtil.getConnections();
            String query = "SELECT * FROM reservations WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, reservationId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                reservation = mapResultSetToReservation(resultSet);
            }

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reservation;
    }

//    public List<Reservation> getReservationsByClientName(String clientName) {
//        List<Reservation> reservations = new ArrayList<>();
//
//        try {
//            Connection conn = DBUtil.getConnections();
//            String query = "SELECT * FROM reservations WHERE client_name = ?";
//            PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setString(1, clientName);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                Reservation reservation = mapResultSetToReservation(resultSet);
//                reservations.add(reservation);
//            }
//
//            DBUtil.closeConnection(conn);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return reservations;
//    }

    public static List<Reservation> getAllReservations() {
        List<Reservation> reservations = new ArrayList<>();

        try {
            Connection conn = DBUtil.getConnections();
            String query = "SELECT * FROM reservations";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Reservation reservation = mapResultSetToReservation(resultSet);
                reservations.add(reservation);
            }

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reservations;
    }


    private static Reservation mapResultSetToReservation(ResultSet resultSet) throws SQLException {
        Reservation reservation = new Reservation();
        reservation.setOffice(resultSet.getString("office"));
        reservation.setOwner(resultSet.getString("owner"));
        reservation.setClientType(resultSet.getString("client_type"));
        reservation.setCreditType(resultSet.getString("credit_type"));
        reservation.setPhoneNo(resultSet.getString("phone_no"));
        reservation.setEmail(resultSet.getString("email"));
        reservation.setRemark(resultSet.getString("remark"));
        reservation.setComments(resultSet.getString("comments"));
        reservation.setStatus(resultSet.getString("status"));
        return reservation;
    }

}
