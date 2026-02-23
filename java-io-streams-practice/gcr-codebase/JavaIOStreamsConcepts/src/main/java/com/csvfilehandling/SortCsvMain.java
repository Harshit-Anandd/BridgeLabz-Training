
package com.csvfilehandling;
import java.util.Scanner;
public class SortCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortCsvService service = new SortCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.sortBySalary(sc.nextLine());
        sc.close();
    }
}
