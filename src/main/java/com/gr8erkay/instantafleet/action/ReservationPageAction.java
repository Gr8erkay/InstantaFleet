package com.gr8erkay.instantafleet.action;

import com.opensymphony.xwork2.ActionSupport;
import com.gr8erkay.instantafleet.dao.ReservationDAO;
import com.gr8erkay.instantafleet.entity.Reservation;

import java.util.List;

public class ReservationPageAction {

    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void initializeReservation()
    {
        reservations = ReservationDAO.getAllReservations();
    }

    public String execute() {
        System.out.println("Welcome execute() method called");
        initializeReservation();
        System.out.println(reservations);

        return "success";
    }
}
