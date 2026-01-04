package com.bridgelabz.day01.hospitalmanagementsystem;
//Derived Class: InPatient (Inheritance)
public class InPatient extends Patient implements Payable {
    private int daysAdmitted;
    private double dailyRoomCharge;

    public InPatient(String name, int id, String history, int days, double roomCharge) {
        super(name, id, history); // Calls parent constructor
        this.daysAdmitted = days;
        this.dailyRoomCharge = roomCharge;
    }

    @Override
    public double calculatePayment() {
        // Helper method usage for cleaner logic
        return BillingHelper.calculateTotalWithTax(daysAdmitted * dailyRoomCharge);
    }
}