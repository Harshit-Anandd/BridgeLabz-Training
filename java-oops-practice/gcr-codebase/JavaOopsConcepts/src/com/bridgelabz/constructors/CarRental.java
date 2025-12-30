package com.bridgelabz.constructors;

//Create class CarRental to manage car rental details and cost calculations.
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental information
    public void displayRentalInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {

        // Create rental object and display information
        CarRental rental = new CarRental("Sarah Smith", "Toyota Camry", 5, 60.0);
        rental.displayRentalInfo();
    }
}