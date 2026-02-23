
package com.csvfilehandling;
import java.util.Scanner;
public class ReadCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadCsvService service = new ReadCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.readCsv(sc.nextLine());
        sc.close();
    }
}
