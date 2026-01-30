package com.exceptions.propagation;

public class Propagation {
    public void method1() {
        // This causes the exception
    	int num1 = 10;
    	int num2 = 0;
        int data = num1 / num2;
        System.out.println(data);
    }

    public void method2() {
        method1(); // Calls method1, exception propagates here
    }
}