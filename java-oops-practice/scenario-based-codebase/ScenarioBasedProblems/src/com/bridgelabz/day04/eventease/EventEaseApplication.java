package com.bridgelabz.day04.eventease;

// --- Main Execution ---
public class EventEaseApplication {
    public static void main(String[] args) {
        Event bday = new BirthdayEvent("EVT-01", "Rohan's 10th", "FunCity", 5000, true, false);
        Event conf = new ConferenceEvent("EVT-02", "Tech Summit", "Grand Hotel", 20000, 50);

        bday.schedule("12th Dec");
        System.out.println("Total Cost: Rs. " + bday.calculateTotalCost());

        conf.schedule("15th Jan");
        System.out.println("Total Cost: Rs. " + conf.calculateTotalCost());
    }
}