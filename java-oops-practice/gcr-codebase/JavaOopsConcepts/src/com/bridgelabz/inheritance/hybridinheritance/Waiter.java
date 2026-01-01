package com.bridgelabz.inheritance.hybridinheritance;

public class Waiter extends PersonBase implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving tables.");
    }
}