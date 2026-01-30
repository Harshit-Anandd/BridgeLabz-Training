package com.collections.mapinterface;
import java.util.*;

public class MapInverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        
        System.out.println("Enter key-value pairs (Key string, Val int). Type 'done' to stop.");
        while(true) {
            String k = sc.next();
            if(k.equals("done")) break;
            int v = sc.nextInt();
            map.put(k, v);
        }
        
        Map<Integer, List<String>> inverted = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            inverted.putIfAbsent(e.getValue(), new ArrayList<>());
            inverted.get(e.getValue()).add(e.getKey());
        }
        
        System.out.println("Inverted: " + inverted);
        sc.close();
    }
}