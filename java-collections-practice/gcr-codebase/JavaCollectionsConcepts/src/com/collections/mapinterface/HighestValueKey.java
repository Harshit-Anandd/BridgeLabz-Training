package com.collections.mapinterface;
import java.util.*;

public class HighestValueKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        
        System.out.println("Enter entries (Key String, Value Int). 'done' to stop.");
        while(true) {
            String k = sc.next();
            if(k.equals("done")) break;
            int v = sc.nextInt();
            map.put(k, v);
        }
        
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }
        
        System.out.println("Key with highest value: " + maxKey + " (" + maxVal + ")");
        sc.close();
    }
}