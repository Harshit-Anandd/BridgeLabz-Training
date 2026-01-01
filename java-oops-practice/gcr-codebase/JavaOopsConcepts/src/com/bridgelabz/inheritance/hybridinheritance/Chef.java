package com.bridgelabz.inheritance.hybridinheritance;

public class Chef extends PersonBase implements Worker {
    public Chef(String name, int id) { super(name, id); }
    
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking dishes.");
    }
}