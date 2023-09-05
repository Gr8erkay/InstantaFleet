package com.gr8erkay.instantafleet.action;

import com.opensymphony.xwork2.ActionSupport;
import com.gr8erkay.instantafleet.entity.Trip;
import com.gr8erkay.instantafleet.dao.TripDAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TripAction extends ActionSupport {

    private Trip trip;

    private String passengerName;
    private Integer passengerNo;
    private String passengerPhoneNo;
    private String passengerEmail;
    private String departure;
    private String destination;
    private String possibleStops;
    private String pickupDate; // You can use a String for date input from the JSP
    private String pickupTime; // You can use a String for time input from the JSP
    private String endDate; // You can use a String for date input from the JSP
    private String endTime; // You can use a String for time input from the JSP
    private String vehicleCategory;
    private String serviceType;
    private String vehicleType;
    private Double amountCharged;
    private String additionalInformation;
    private String personnel;
    private String vehicle;
    private Boolean isResourceAvailable;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String execute() {
        TripDAO.createTripsTable();

        Trip newTrip = new Trip();
        // Set properties of the newTrip object here using setters
        newTrip.setPassengerName(passengerName);
        newTrip.setPassengerNo(passengerNo);
        newTrip.setPassengerPhoneNo(passengerPhoneNo);
        newTrip.setPassengerEmail(passengerEmail);
        newTrip.setDeparture(departure);
        newTrip.setDestination(destination);
        newTrip.setPossibleStops(possibleStops);
        // Cnvert the date and time strings to LocalDateTime
        newTrip.setPickupDate(convertToDate(pickupDate));
        newTrip.setPickupTime(convertToTime(pickupTime));
        newTrip.setEndDate(convertToDate(endDate));
        newTrip.setEndTime(convertToTime(endTime));
        newTrip.setVehicleCategory(vehicleCategory);
        newTrip.setServiceType(serviceType);
        newTrip.setVehicleType(vehicleType);
        newTrip.setAmountCharged(amountCharged);
        newTrip.setAdditionalInformation(additionalInformation);
        newTrip.setPersonnel(personnel);
        newTrip.setVehicle(vehicle);
        newTrip.setResourceAvailable(isResourceAvailable);
        newTrip.setStatus(status);

        TripDAO.createTrip(newTrip);

        return SUCCESS;
    }

    // Helper methods for converting date and time strings to LocalDateTime
    private LocalDateTime convertToDate(String dateStr) {
        // Define the expected date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Parse the input date string into LocalDateTime
        try {
            LocalDate localDate = LocalDate.parse(dateStr, dateFormatter);
            return localDate.atStartOfDay(); // Set time to midnight (00:00:00)
        } catch (Exception e) {
            // Handle parsing errors
            e.printStackTrace();
            return null; // Return null or handle the error as needed
        }
    }


    private LocalDateTime convertToTime(String timeStr) {
        // Define the expected time format (HH:mm)
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Parse the input time string into LocalDateTime
        try {
            LocalTime localTime = LocalTime.parse(timeStr, timeFormatter);
            return LocalDateTime.of(LocalDate.now(), localTime); // Use today's date and the parsed time
        } catch (Exception e) {
            // Handle parsing errors
            e.printStackTrace();
            return null; // Return null or handle the error as needed
        }
    }


    // Getter and setter methods for trip and other properties

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Integer getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(Integer passengerNo) {
        this.passengerNo = passengerNo;
    }

    public String getPassengerPhoneNo() {
        return passengerPhoneNo;
    }

    public void setPassengerPhoneNo(String passengerPhoneNo) {
        this.passengerPhoneNo = passengerPhoneNo;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPossibleStops() {
        return possibleStops;
    }

    public void setPossibleStops(String possibleStops) {
        this.possibleStops = possibleStops;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(Double amountCharged) {
        this.amountCharged = amountCharged;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getResourceAvailable() {
        return isResourceAvailable;
    }

    public void setResourceAvailable(Boolean resourceAvailable) {
        isResourceAvailable = resourceAvailable;
    }
}
