package com.bridgelabz.linkedlist.ticketreservation;

public class TicketReservation {
    TicketNode head = null, tail = null;

    // 1. Add Ticket
    public void addTicket(int id, String cust) {
        TicketNode newNode = new TicketNode(id, cust);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // 2. Remove Ticket
    public void removeTicket(int id) {
        if (head == null) return;
        TicketNode current = head, prev = tail;

        do {
            if (current.ticketId == id) {
                if (current == head && current == tail) { // Single node
                    head = null; tail = null;
                } else {
                    prev.next = current.next;
                    if (current == head) head = current.next;
                    if (current == tail) tail = prev;
                }
                System.out.println("Ticket " + id + " cancelled.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // 3. Display Tickets
    public void display() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println("Ticket: " + temp.ticketId + " - " + temp.customer);
            temp = temp.next;
        } while (temp != head);
    }

}