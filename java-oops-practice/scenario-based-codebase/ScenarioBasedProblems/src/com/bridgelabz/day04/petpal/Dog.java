package com.bridgelabz.day04.petpal;

// 3. Derived Classes
public class Dog extends Pet {
    public Dog(String name) { super(name); }
    
    @Override
    public void makeSound() { System.out.println(name + " says: Woof Woof!"); }
}