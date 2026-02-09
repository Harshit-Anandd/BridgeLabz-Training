package com.reflections.privatemethod;
import java.lang.reflect.Method;

public class PrivateMethodInvoker {
    public void invokeMultiply(int a, int b) {
        try {
            Calculator calc = new Calculator();
            Class<?> clazz = calc.getClass();
            
            // Get private method with arguments
            Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true); // Bypass private
            
            int result = (int) method.invoke(calc, a, b);
            System.out.println("Result from private multiply(): " + result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}