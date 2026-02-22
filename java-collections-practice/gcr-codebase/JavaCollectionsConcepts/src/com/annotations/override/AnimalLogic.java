package com.annotations.override;
public class AnimalLogic {
    public void playSound(int choice) {
        Animal animal;
        if (choice == 1) {
            animal = new Dog();
        } else {
            animal = new Animal();
        }
        animal.makeSound();
    }
}
