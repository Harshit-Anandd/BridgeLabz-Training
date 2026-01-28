package com.bridgelabz.day09.medwarehouse;

public class Medicine {
    String name;
    int expiryDate; // YYYYMMDD

    Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}