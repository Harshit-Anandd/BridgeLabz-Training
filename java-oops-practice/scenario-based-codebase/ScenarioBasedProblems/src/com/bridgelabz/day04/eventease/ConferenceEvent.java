package com.bridgelabz.day04.eventease;

// 4. Derived: Conference Event
public class ConferenceEvent extends Event {
    private int attendees;

    public ConferenceEvent(String id, String name, String loc, double cost, int attendees) {
        super(id, name, loc, cost);
        this.attendees = attendees;
    }

    @Override
    public double calculateTotalCost() {
        // Logic: Corporate tax 18% added
        double total = baseCost + (attendees * 500); // 500 per head food cost
        return total * 1.18; 
    }
}