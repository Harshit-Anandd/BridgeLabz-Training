package com.bridgelabz.day04.edumentor;

// 2. Base Class: User
public class User {
    protected String name;
    protected String email;
    protected String userId;

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }
}