package com.bridgelabz.linkedlist.ticketreservation;

public class TicketNode {
    int ticketId;
    String customer;
    TicketNode next;

    public TicketNode(int id, String cust) {
        this.ticketId = id; this.customer = cust;
    }
}