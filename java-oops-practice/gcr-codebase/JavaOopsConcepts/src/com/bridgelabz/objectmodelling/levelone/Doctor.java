package com.bridgelabz.objectmodelling.levelone;

public class Doctor {
    private String name;
    
    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + this.name + " is currently consulting Patient " + p.getName());
    }
}