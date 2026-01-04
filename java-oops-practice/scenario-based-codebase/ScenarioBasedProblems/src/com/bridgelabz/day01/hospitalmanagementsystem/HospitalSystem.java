package com.bridgelabz.day01.hospitalmanagementsystem;

// --- Main Execution ---
public class HospitalSystem {
    public static void main(String[] args) {
        // Polymorphism: Treating InPatient and OutPatient as Payable
        Payable p1 = new InPatient("John Doe", 101, "Flu", 3, 2000);
        Payable p2 = new OutPatient("Alice Smith", 102, 500);

        System.out.println("InPatient Bill: $" + p1.calculatePayment());
        System.out.println("OutPatient Bill: $" + p2.calculatePayment());
        
        // Casting to access Patient methods
        System.out.println(((Patient)p1).getPatientSummary());
    }
}