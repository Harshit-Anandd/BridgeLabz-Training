package com.bridgelabz.day01.hospitalmanagementsystem;
//Base Class: Patient
//'abstract' prevents creating a generic Patient without a type
public abstract class Patient {
    protected String name;
    protected int id;
    // Encapsulation: Private to protect sensitive medical data
    private String medicalHistory; 

    // Constructor 1: Normal Admission (No history initially)
    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.medicalHistory = "New Patient - No History";
    }

    // Constructor 2: Overloaded for Emergency with history
    public Patient(String name, int id, String medicalHistory) {
        this.name = name;
        this.id = id;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation: Public getter exposes summary, not direct access
    public String getPatientSummary() {
        return "ID: " + id + " | Name: " + name + " | History: " + medicalHistory;
    }
}