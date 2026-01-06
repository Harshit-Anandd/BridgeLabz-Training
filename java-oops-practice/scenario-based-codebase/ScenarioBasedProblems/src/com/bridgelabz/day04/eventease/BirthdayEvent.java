package com.bridgelabz.day04.eventease;

// 3. Derived: Birthday Event
public class BirthdayEvent extends Event {
    private boolean includeCake;
    private boolean includeClown;

    public BirthdayEvent(String id, String name, String loc, double cost, boolean cake, boolean clown) {
        super(id, name, loc, cost);
        this.includeCake = cake;
        this.includeClown = clown;
    }

    @Override
    public double calculateTotalCost() {
        double total = baseCost;
        if (includeCake) total += 1500;
        if (includeClown) total += 2000;
        // Logic: Birthday discount of 10%
        return total * 0.90; 
    }
    
    // Overriding schedule to add specific details
    @Override
    public void schedule(String date) {
        super.schedule(date);
        System.out.println("Reminder: Order the cake 2 days prior!");
    }
}