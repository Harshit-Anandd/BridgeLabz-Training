package com.bridgelabz.day04.petpal;

// 3. Derived Classes
public class Cat extends Pet {
    public Cat(String name) { 
    	super(name); 
    	}
    
    @Override
    public void makeSound() { 
    	System.out.println(name + " says: Meow..."); 
    	}
}