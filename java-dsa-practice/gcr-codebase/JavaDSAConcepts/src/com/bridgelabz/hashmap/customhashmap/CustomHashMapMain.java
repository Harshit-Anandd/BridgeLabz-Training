package com.bridgelabz.hashmap.customhashmap;

public class CustomHashMapMain {

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Get One: " + map.get("One"));
        map.remove("One");
        System.out.println("Get One after delete: " + map.get("One"));
    }
    
}