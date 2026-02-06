package com.functionalinterfaces.usercredential;

//Sensitive data class
public class UserCredentials implements SensitiveData {

	private String username;

	public UserCredentials(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
