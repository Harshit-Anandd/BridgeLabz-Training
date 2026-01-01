package com.bridgelabz.inheritance.hybridinheritance;

import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Chef c = new Chef("Gordon", 101);
        Waiter w = new Waiter("Harry", 102);

        c.performDuties();
        w.performDuties();
        
        sc.close();
    }
}