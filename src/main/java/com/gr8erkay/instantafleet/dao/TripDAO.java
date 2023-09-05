package com.gr8erkay.instantafleet.dao;

import com.gr8erkay.instantafleet.dbutil.DBUtil;
import com.gr8erkay.instantafleet.entity.Trip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class TripDAO {

    public static void createTrip(Trip trip) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtil.getConnections();

            String sql = "INSERT INTO trips (passengerName, passengerNo, passengerPhoneNo, passengerEmail, departure, destination, possibleStops, pickupDate, pickupTime, endDate, endTime, vehicleCategory, serviceType, vehicleType, amountCharged, additionalInformation, personnel, vehicle, isResourceAvailable, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, trip.getPassengerName());
            statement.setInt(2, trip.getPassengerNo());
            statement.setString(3, trip.getPassengerPhoneNo());
            statement.setString(4, trip.getPassengerEmail());
            statement.setString(5, trip.getDeparture());
            statement.setString(6, trip.getDestination());
            statement.setString(7, trip.getPossibleStops());
            statement.setObject(8, trip.getPickupDate());
            statement.setObject(9, trip.getPickupTime());
            statement.setObject(10, trip.getEndDate());
            statement.setObject(11, trip.getEndTime());
            statement.setString(12, trip.getVehicleCategory());
            statement.setString(13, trip.getServiceType());
            statement.setString(14, trip.getVehicleType());
            statement.setDouble(15, trip.getAmountCharged());
            statement.setString(16, trip.getAdditionalInformation());
            statement.setString(17, trip.getPersonnel());
            statement.setString(18, trip.getVehicle());
            statement.setBoolean(19, trip.getResourceAvailable());
            statement.setString(20, trip.getStatus());

            statement.executeUpdate();
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

    public static void createTripsTable() {
        try {
            Connection conn = DBUtil.getConnections();
            Statement st = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS trips (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "passengerName VARCHAR(255), " +
                    "passengerNo INT, " +
                    "passengerPhoneNo VARCHAR(20), " +
                    "passengerEmail VARCHAR(255), " +
                    "departure VARCHAR(255), " +
                    "destination VARCHAR(255), " +
                    "possibleStops VARCHAR(255), " +
                    "pickupDate DATETIME, " +
                    "pickupTime DATETIME, " +
                    "endDate DATETIME, " +
                    "endTime DATETIME, " +
                    "vehicleCategory VARCHAR(255), " +
                    "serviceType VARCHAR(255), " +
                    "vehicleType VARCHAR(255), " +
                    "amountCharged DOUBLE, " +
                    "additionalInformation VARCHAR(255), " +
                    "personnel VARCHAR(255), " +
                    "vehicle VARCHAR(255), " +
                    "isResourceAvailable BOOLEAN, " +
                    "status VARCHAR(50))";

            st.executeUpdate(createTableSQL);

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Trip getTripById(int tripId) {
        Trip trip = null;

        try {
            Connection conn = DBUtil.getConnections();
            String query = "SELECT * FROM trips WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, tripId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                trip = mapResultSetToTrip(resultSet);
            }

            DBUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trip;
    }

    // Helper method to map a ResultSet to a Trip object
    private Trip mapResultSetToTrip(ResultSet resultSet) throws SQLException {
        Trip trip = new Trip();
        // Map the ResultSet columns to the corresponding Trip attributes
        trip.setPassengerName(resultSet.getString("passengerName"));
        trip.setPassengerNo(resultSet.getInt("passengerNo"));
        trip.setPassengerPhoneNo(resultSet.getString("passengerPhoneNo"));
        trip.setPassengerEmail(resultSet.getString("passengerEmail"));
        trip.setDeparture(resultSet.getString("departure"));
        trip.setDestination(resultSet.getString("destination"));
        trip.setPossibleStops(resultSet.getString("possibleStops"));
        trip.setPickupDate(resultSet.getObject("pickupDate", LocalDateTime.class));
        trip.setPickupTime(resultSet.getObject("pickupTime", LocalDateTime.class));
        trip.setEndDate(resultSet.getObject("endDate", LocalDateTime.class));
        trip.setEndTime(resultSet.getObject("endTime", LocalDateTime.class));
        trip.setVehicleCategory(resultSet.getString("vehicleCategory"));
        trip.setServiceType(resultSet.getString("serviceType"));
        trip.setVehicleType(resultSet.getString("vehicleType"));
        trip.setAmountCharged(resultSet.getDouble("amountCharged"));
        trip.setAdditionalInformation(resultSet.getString("additionalInformation"));
        trip.setPersonnel(resultSet.getString("personnel"));
        trip.setVehicle(resultSet.getString("vehicle"));
        trip.setResourceAvailable(resultSet.getBoolean("isResourceAvailable"));
        trip.setStatus(resultSet.getString("status"));
        return trip;
    }
}
