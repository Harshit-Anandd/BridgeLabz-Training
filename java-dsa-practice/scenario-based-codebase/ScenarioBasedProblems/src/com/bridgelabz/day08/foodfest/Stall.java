package com.bridgelabz.day08.foodfest;

public class Stall {
    String name;
    int footfall;

    Stall(String name, int footfall) {
        this.name = name;
        this.footfall = footfall;
    }

    public String toString() {
        return name + " | Footfall: " + footfall;
    }
}