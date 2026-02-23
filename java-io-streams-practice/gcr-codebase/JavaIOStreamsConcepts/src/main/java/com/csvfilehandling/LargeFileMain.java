
package com.csvfilehandling;
import java.util.Scanner;
public class LargeFileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LargeFileService service = new LargeFileService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.process(sc.nextLine());
        sc.close();
    }
}
