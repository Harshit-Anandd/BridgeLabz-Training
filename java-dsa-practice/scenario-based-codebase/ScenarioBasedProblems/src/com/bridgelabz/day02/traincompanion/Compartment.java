package com.bridgelabz.day02.traincompanion;

public class Compartment {
    String name;
    Compartment prev;
    Compartment next;

    Compartment(String name) {
        this.name = name;
    }
}