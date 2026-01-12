package com.bridgelabz.day01.ambulanceroute;

public class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name) {
        this.name = name;
        this.available = true;
    }
}