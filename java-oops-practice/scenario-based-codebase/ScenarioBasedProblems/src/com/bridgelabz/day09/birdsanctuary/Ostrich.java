package com.bridgelabz.day09.birdsanctuary;

// File: Ostrich.java (Neither)
public class Ostrich extends Bird {
    public Ostrich(String id, String name) {
        super(id, name, "Ostrich");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " runs fast to catch a bug to eat.");
    }
}