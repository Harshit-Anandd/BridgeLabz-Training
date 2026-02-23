
package com.csvfilehandling;
import java.util.Scanner;
public class UpdateSalaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UpdateSalaryService service = new UpdateSalaryService();
        System.out.println("Enter the file path of the input CSV file: ");
        String input = sc.nextLine();
        System.out.println("Enter the file path of the output CSV file: ");
        String output = sc.nextLine();
        service.updateSalary(input, output);
        sc.close();
    }
}
