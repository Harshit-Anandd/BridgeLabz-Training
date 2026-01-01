package com.bridgelabz.encapsulation;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name);
    }
}