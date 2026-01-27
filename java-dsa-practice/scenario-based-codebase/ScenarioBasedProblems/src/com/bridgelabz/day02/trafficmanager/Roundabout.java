package com.bridgelabz.day02.trafficmanager;

public class Roundabout {

    private VehicleNode head;

    public void addVehicle(String vehicleNumber) {

        VehicleNode vehicle = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = vehicle;
            head.next = head;
            return;
        }

        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = vehicle;
        vehicle.next = head;
    }

    public boolean removeVehicle(String vehicleNumber) {

        if (head == null) {
            return false;
        }

        VehicleNode curr = head;
        VehicleNode prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicleNumber)) {

                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    VehicleNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = curr.next;
                    last.next = head;
                }
                return true;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        return false;
    }

    public void displayRoundabout() {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Vehicles in roundabout: ");

        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return head == null;
    }
}