package com.bridgelabz.constructors.levelone;

//Create class HotelBooking to demonstrate different constructor types.
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Display booking details
    public void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {

        // Using Default Constructor
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayBooking();

        // Using Parameterized Constructor
        HotelBooking customBooking = new HotelBooking("John Doe", "Suite", 3);
        customBooking.displayBooking();

        // Using Copy Constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        copiedBooking.displayBooking();
    }
}