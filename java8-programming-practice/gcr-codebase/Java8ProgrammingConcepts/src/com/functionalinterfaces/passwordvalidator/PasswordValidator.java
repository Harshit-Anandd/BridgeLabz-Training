package com.functionalinterfaces.passwordvalidator;
import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();

		System.out.println(
				SecurityUtils.isStrong(pwd)
				? "Strong Password"
						: "Weak Password"
				);
		
		sc.close();
	}
}
