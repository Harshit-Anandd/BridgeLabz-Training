
package com.csvfilehandling;
import java.util.Scanner;
public class CountCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountCsvService service = new CountCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.countRows(sc.nextLine());
        sc.close();
    }
}
