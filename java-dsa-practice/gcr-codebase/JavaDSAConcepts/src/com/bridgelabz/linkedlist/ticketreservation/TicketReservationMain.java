package com.bridgelabz.linkedlist.ticketreservation;

public class TicketReservationMain {

    public static void main(String[] args) {
        TicketReservation tr = new TicketReservation();
        tr.addTicket(101, "John");
        tr.addTicket(102, "Doe");
        tr.display();
        
        tr.removeTicket(101);
        tr.display();
    }
    
}