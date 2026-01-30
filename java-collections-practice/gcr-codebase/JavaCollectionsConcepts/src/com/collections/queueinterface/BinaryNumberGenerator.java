package com.collections.queueinterface;
import java.util.*;

public class BinaryNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        
        System.out.print("Binary Numbers: ");
        for (int i = 0; i < n; i++) {
            String current = q.poll();
            System.out.print(current + " ");
            q.offer(current + "0");
            q.offer(current + "1");
        }
        System.out.println();
        sc.close();
    }
}