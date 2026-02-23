
package com.csvfilehandling;
import java.util.Scanner;
public class ValidateCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateCsvService service = new ValidateCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.validate(sc.nextLine());
        sc.close();
    }
}
