package com.reflections.customproxy;

public class GreetingHello implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}