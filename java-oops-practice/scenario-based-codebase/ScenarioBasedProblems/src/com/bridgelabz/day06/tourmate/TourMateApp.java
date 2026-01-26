package com.bridgelabz.day06.tourmate;

// --- Main Execution ---
public class TourMateApp {
    public static void main(String[] args) {
        // Create Components
        Hotel parisHotel = new Hotel("Grand Paris", 50000);
        Transport flight = new Transport("Emirates Flight", 40000);
        
        Hotel goaHotel = new Hotel("Goa Beach Resort", 15000);
        Transport train = new Transport("Vande Bharat Express", 3000);

        // Create Trips
        InternationalTrip parisTrip = new InternationalTrip("Paris", 7, parisHotel, flight, 8000);
        parisTrip.addActivity(new Activity("Eiffel Tower Tour", 5000));
        
        DomesticTrip goaTrip = new DomesticTrip("Goa", 4, goaHotel, train);
        goaTrip.addActivity(new Activity("Scuba Diving", 4000));

        // Booking & Costing
        parisTrip.book();
        System.out.printf("Total Estimated Cost (with Forex): Rs. %.2f\n", parisTrip.calculateTotalCost());

        goaTrip.book();
        System.out.printf("Total Estimated Cost (with GST): Rs. %.2f\n", goaTrip.calculateTotalCost());
    }
}