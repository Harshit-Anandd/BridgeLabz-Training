
package com.jsonfilehandling.assignments;
import java.util.Scanner;
public class MergeJsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeJsonService service = new MergeJsonService();
        System.out.println("Enter the file path of the required 3 JSON files: ");
        service.merge(sc.nextLine(), sc.nextLine(), sc.nextLine());
        sc.close();
    }
}
