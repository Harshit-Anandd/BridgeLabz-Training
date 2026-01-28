package com.bridgelabz.day07.fitnesstracker;

public class UserSteps {
    String name;
    int steps;

    UserSteps(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    public String toString() {
        return name + " | Steps: " + steps;
    }
}