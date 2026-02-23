
package com.csvfilehandling;
import java.util.Scanner;
public class EncryptCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EncryptCsvService service = new EncryptCsvService();
        System.out.println("Enter the file path of the required CSV file and the output file: ");
        service.encrypt(sc.nextLine(), sc.nextLine());
        sc.close();
    }
}
