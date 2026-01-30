package com.collections.queueinterface;
import java.util.*;

public class CircularBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Buffer Size: ");
        int size = sc.nextInt();
        ArrayDeque<Integer> buffer = new ArrayDeque<>(size);
        
        while(true) {
            System.out.println("Buffer: " + buffer);
            System.out.println("1. Add\n2. Remove Oldest\n3. Exit");
            int ch = sc.nextInt();
            if (ch == 3) break;
            
            if (ch == 1) {
                if (buffer.size() == size) buffer.pollFirst(); // Remove oldest
                System.out.print("Enter val: ");
                buffer.offerLast(sc.nextInt());
            } else if (ch == 2) {
                if (!buffer.isEmpty()) buffer.pollFirst();
            }
        }
        sc.close();
    }
}