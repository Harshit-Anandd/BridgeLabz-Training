
package com.csvfilehandling;
import java.util.Scanner;
public class WriteCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WriteCsvService service = new WriteCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.writeCsv(sc.nextLine());
        sc.close();
    }
}
