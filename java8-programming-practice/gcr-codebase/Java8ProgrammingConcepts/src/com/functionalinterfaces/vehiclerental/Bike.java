package com.functionalinterfaces.vehiclerental;
public class Bike implements Rentable {

    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
