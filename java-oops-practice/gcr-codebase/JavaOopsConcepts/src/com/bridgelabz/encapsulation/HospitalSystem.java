package com.bridgelabz.encapsulation;

import java.util.Scanner;
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        InPatient p = new InPatient(101, "John Doe", 45, 5, 2000);
        
        System.out.print("Enter Diagnosis for InPatient: ");
        String diag = sc.nextLine();
        p.addRecord(diag);

        System.out.println("\n--- Bill ---");
        p.getPatientDetails();
        p.viewRecords();
        System.out.println("Total Bill: " + p.calculateBill());
        
        sc.close();
    }
}