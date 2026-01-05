package com.bridgelabz.queue.circulartour;

public class CircularTour {
    static class PetrolPump {
        int petrol;
        int distance;
        public PetrolPump(int p, int d) { petrol = p; distance = d; }
    }

    public static int printTourStart(PetrolPump[] pumps) {
        int start = 0;
        int deficit = 0;
        int balance = 0;

        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;

            // If balance is negative, this start point is invalid
            if (balance < 0) {
                start = i + 1; // Try next pump as start
                deficit += balance; // Store the deficit
                balance = 0; // Reset balance
            }
        }
        // If total petrol is >= total distance, a tour is possible
        return (balance + deficit >= 0) ? start : -1;
    }

}