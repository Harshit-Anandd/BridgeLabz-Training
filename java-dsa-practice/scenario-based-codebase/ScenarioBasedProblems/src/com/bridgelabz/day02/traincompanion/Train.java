package com.bridgelabz.day02.traincompanion;

public class Train {
    private Compartment head;

    public void addCompartment(String name) {
        Compartment c = new Compartment(name);
        if (head == null) {
            head = c;
            return;
        }

        Compartment temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = c;
        c.prev = temp;
    }

    public void displayNeighbors(String name) {
        Compartment temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " + (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " + (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
    }
}