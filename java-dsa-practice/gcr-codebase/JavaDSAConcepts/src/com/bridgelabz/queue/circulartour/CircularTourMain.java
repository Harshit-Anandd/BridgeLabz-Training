package com.bridgelabz.queue.circulartour;

import com.bridgelabz.queue.circulartour.CircularTour.PetrolPump;

public class CircularTourMain {

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        System.out.println("Start Index: " + CircularTour.printTourStart(pumps));
    }
    
}