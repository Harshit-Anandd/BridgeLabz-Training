package com.designpattern.smartuniversitylibrary;
public class PriorityReservation implements ReservationStrategy {

    public void reserve(String userName, String bookTitle) {
        System.out.println(userName + " reserved " + bookTitle + " (Priority policy)");
        Logger.getInstance().log("Priority reservation made by " + userName);
    }
}
