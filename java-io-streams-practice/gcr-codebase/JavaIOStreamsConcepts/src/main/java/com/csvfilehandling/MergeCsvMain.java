
package com.csvfilehandling;
import java.util.Scanner;
public class MergeCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeCsvService service = new MergeCsvService();
        System.out.println("Enter the file path of the required CSV file1, file2 and output file: ");
        service.merge(sc.nextLine(), sc.nextLine(), sc.nextLine());
        sc.close();
    }
}
