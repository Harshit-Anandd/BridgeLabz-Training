//Create a DistanceConversion class to compute and convert distance from feet to yards and miles

import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter distance in feet
        System.out.println("Enter distance in feet : ");

        //Read distance in feet
        double distanceInFeet = sc.nextDouble();

        //Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        //Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        //Display output
        System.out.println("The distance in feet is " + distanceInFeet + ", in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        //Close the Scanner Stream
        sc.close();
    }
}
