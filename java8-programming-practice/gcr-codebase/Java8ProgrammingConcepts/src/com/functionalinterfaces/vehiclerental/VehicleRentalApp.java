package com.functionalinterfaces.vehiclerental;
import java.util.Scanner;

public class VehicleRentalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rentable vehicle;

        System.out.println("1.Car 2.Bike");
        int choice = sc.nextInt();

        vehicle = (choice == 1) ? new Car() : new Bike();

        vehicle.rent();
        vehicle.returnVehicle();
        
        sc.close();
    }
}
