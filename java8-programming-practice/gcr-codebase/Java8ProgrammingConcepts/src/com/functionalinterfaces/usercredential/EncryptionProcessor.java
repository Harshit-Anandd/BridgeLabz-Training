package com.functionalinterfaces.usercredential;

public class EncryptionProcessor {

	public static void main(String[] args) {

		UserCredentials creds =
				new UserCredentials("adminUser");

		if (creds instanceof SensitiveData) {
			System.out.println(
					"Encrypting sensitive data for user: "
							+ creds.getUsername());
		} else {
			System.out.println("No encryption required.");
		}
	}
}
