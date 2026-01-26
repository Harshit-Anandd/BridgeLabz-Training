package com.bridgelabz.day06.tourmate;
import java.util.List;
import java.util.ArrayList;

// 3. Base Class: Trip
public abstract class Trip implements IBookable {
    protected String destination;
    protected int durationDays;
    // Encapsulation: Detailed costs are hidden, only total is exposed via methods
    protected Hotel hotel;
    protected Transport transport;
    protected List<Activity> activities = new ArrayList<>();

    public Trip(String dest, int days, Hotel hotel, Transport transport) {
        this.destination = dest;
        this.durationDays = days;
        this.hotel = hotel;
        this.transport = transport;
    }

    public void addActivity(Activity act) {
        activities.add(act);
    }
    
    // Operator Logic: Total Budget Calculation
    public double calculateTotalCost() {
        double activityCost = 0;
        for(Activity a : activities) {
			activityCost += a.cost;
		}
        return hotel.cost + transport.cost + activityCost;
    }
}