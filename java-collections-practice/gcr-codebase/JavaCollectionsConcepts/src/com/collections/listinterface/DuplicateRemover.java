package com.collections.listinterface;
import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            list.add(num);
        }
        
        // Use LinkedHashSet to preserve order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        
        System.out.println("Unique List: " + result);
        sc.close();
    }
}