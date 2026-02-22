package com.annotations.maxlength;
public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;
    }
    
    public String getUsername() { return username; }
}
