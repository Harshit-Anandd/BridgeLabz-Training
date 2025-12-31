package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.print("Enter Doctor Name: ");
        Doctor doc = new Doctor(sc.nextLine());
        hospital.addDoctor(doc);

        System.out.print("Enter Patient Name: ");
        Patient pat = new Patient(sc.nextLine());
        hospital.addPatient(pat);

        System.out.println("\n--- Consultation Process ---");
        doc.consult(pat);

        sc.close();
    }
}