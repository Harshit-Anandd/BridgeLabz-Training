package com.bridgelabz.day01.hospitalmanagementsystem;
//Derived Class: OutPatient (Inheritance)
public class OutPatient extends Patient implements Payable {
    private double consultationFee;

    public OutPatient(String name, int id, double fee) {
        super(name, id);
        this.consultationFee = fee;
    }

    @Override
    public double calculatePayment() {
        return BillingHelper.calculateTotalWithTax(consultationFee);
    }
}