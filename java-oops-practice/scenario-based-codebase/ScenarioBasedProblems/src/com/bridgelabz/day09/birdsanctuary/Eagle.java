package com.bridgelabz.day09.birdsanctuary;

// File: Eagle.java (Flies only)
public class Eagle extends Bird implements Flyable {
    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high in the sky!");
    }
}