package com.collections.listinterface;
import java.util.*;

public class ListRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            list.add(num);
        }
        
        System.out.print("Enter rotation positions: ");
        int k = sc.nextInt();
        
        int size = list.size();
        if (size > 0) {
            k = k % size;
            if (k < 0) k += size;
            
            // Rotating
            Collections.rotate(list, k); // Using built-in for efficiency, or manual loop
        }
        
        System.out.println("Rotated List: " + list);
        sc.close();
    }
}