package com.bridgelabz.day04.eventease;

// 2. Base Class: Event
public abstract class Event implements Schedulable {
    // Encapsulation: ID cannot be changed
    private String eventId; 
    protected String eventName;
    protected String location;
    protected double baseCost;
    
    public Event(String id, String name, String loc, double cost) {
        this.eventId = id;
        this.eventName = name;
        this.location = loc;
        this.baseCost = cost;
    }

    public abstract double calculateTotalCost();

    @Override
    public void schedule(String date) {
        System.out.println("Event [" + eventName + "] scheduled on " + date + " at " + location);
    }

    @Override
    public void cancel() {
        System.out.println("Event [" + eventName + "] has been cancelled.");
    }
}