package com.gr8erkay.instantafleet.entity;

import java.time.LocalDateTime;

public class Trip {
    String passengerName;
    Integer passengerNo;
    String passengerPhoneNo;
    String passengerEmail;
    String departure;
    String destination;
    String possibleStops;
    LocalDateTime pickupDate;
    LocalDateTime pickupTime;
    LocalDateTime endDate;
    LocalDateTime endTime;
    String vehicleCategory;
    String serviceType;
    String vehicleType;
    Double amountCharged;
    String additionalInformation;
    String personnel;
    String vehicle;
    Boolean isResourceAvailable;

    String status;

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

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "passengerName='" + passengerName + '\'' +
                ", passengerNo=" + passengerNo +
                ", passengerPhoneNo='" + passengerPhoneNo + '\'' +
                ", passengerEmail='" + passengerEmail + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", possibleStops='" + possibleStops + '\'' +
                ", pickupDate=" + pickupDate +
                ", pickupTime=" + pickupTime +
                ", endDate=" + endDate +
                ", endTime=" + endTime +
                ", vehicleCategory='" + vehicleCategory + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", amountCharged=" + amountCharged +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", personnel='" + personnel + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", isResourceAvailable=" + isResourceAvailable +
                ", status='" + status + '\'' +
                '}';
    }
}
