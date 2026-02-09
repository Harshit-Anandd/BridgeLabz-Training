package com.junit.main;

public class PasswordValidator {
	// Min 8 chars, 1 uppercase, 1 digit
	public boolean isValid(String password) {
		String regex = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";
		return password != null && password.matches(regex);
	}
}