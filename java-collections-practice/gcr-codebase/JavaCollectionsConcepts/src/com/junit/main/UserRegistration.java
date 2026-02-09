package com.junit.main;

public class UserRegistration {
	public boolean registerUser(String username, String email, String password) {
		if (username == null || username.isEmpty()) 
			throw new IllegalArgumentException("Invalid Username");
		if (email == null || !email.contains("@")) 
			throw new IllegalArgumentException("Invalid Email");
		if (password == null || password.length() < 6) 
			throw new IllegalArgumentException("Weak Password");
		return true;
	}
}