package com.bridgelabz.day04.hospitalqueue;

public class Patient {
    String name;
    int criticality; // 1 (low) – 10 (high)

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return name + " | Criticality: " + criticality;
    }
}