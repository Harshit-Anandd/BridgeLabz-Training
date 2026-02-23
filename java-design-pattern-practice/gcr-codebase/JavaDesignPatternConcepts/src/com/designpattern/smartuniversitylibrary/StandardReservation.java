package com.designpattern.smartuniversitylibrary;
public class StandardReservation implements ReservationStrategy {

    public void reserve(String userName, String bookTitle) {
        System.out.println(userName + " reserved " + bookTitle + " (Standard policy)");
        Logger.getInstance().log("Reservation made by " + userName);
    }
}
