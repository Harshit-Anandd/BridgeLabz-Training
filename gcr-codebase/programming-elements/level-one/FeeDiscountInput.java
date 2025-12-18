//Program to calculate fee discount based on user input

import java.util.Scanner;
public class FeeDiscountInput {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter fee and discount percent
        System.out.println("Enter fee and discount percent : ");

        //Read fee and discount percent
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();

        //Calculate discount
        double discount = (discountPercent / 100) * fee;

        //Calculate final fee
        double finalFee = fee - discount;

        //Display output
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);

        //Close Scanner Stream
        sc.close();
    }
}
