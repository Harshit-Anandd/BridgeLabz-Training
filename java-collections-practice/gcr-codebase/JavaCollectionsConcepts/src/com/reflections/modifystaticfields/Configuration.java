package com.reflections.modifystaticfields;

public class Configuration {
    private static String API_KEY = "DEFAULT_KEY_123";
    
    public static void printKey() {
        System.out.println("Current API_KEY: " + API_KEY);
    }
}