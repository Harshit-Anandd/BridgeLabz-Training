package com.bridgelabz.day02.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private Roundabout roundabout = new Roundabout();
    private Queue<String> waitingQueue = new LinkedList<>();
    private static final int MAX_QUEUE_SIZE = 5;

    public void enqueueVehicle(String vehicleNumber) {

        if (waitingQueue.size() == MAX_QUEUE_SIZE) {
            System.out.println("Waiting queue overflow.");
            return;
        }

        waitingQueue.add(vehicleNumber);
        System.out.println("Vehicle added to waiting queue.");
    }

    public void allowVehicleEntry() {

        if (waitingQueue.isEmpty()) {
            System.out.println("No vehicles waiting.");
            return;
        }

        String vehicle = waitingQueue.poll();
        roundabout.addVehicle(vehicle);
        System.out.println("Vehicle entered roundabout: " + vehicle);
    }

    public void exitVehicle(String vehicleNumber) {

        if (roundabout.removeVehicle(vehicleNumber)) {
            System.out.println("Vehicle exited roundabout.");
        } else {
            System.out.println("Vehicle not found in roundabout.");
        }
    }

    public void displayState() {
        roundabout.displayRoundabout();
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}