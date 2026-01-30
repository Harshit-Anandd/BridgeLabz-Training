package com.collections.listinterface;
import java.util.*;

public class NthElementFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        
        System.out.println("Enter elements (type 'done' to finish):");
        while (true) {
            String input = sc.next();
            if (input.equals("done")) break;
            list.add(input);
        }
        
        System.out.print("Enter N (position from end): ");
        int n = sc.nextInt();
        
        // Two pointer approach or size calc (Question says without calculating size, implying 2 pointers)
        if (n <= 0) {
            System.out.println("Invalid N");
        } else {
            Iterator<String> mainPtr = list.iterator();
            Iterator<String> refPtr = list.iterator();
            
            int count = 0;
            boolean found = false;
            while (count < n) {
                if (refPtr.hasNext()) {
                    refPtr.next();
                    count++;
                } else {
                    System.out.println("N is larger than list size.");
                    found = true; // effectively skipped logic
                    break;
                }
            }
            
            if (!found) {
                while (refPtr.hasNext()) {
                    mainPtr.next();
                    refPtr.next();
                }
                System.out.println("Nth element from end: " + mainPtr.next());
            }
        }
        sc.close();
    }
}