package com.functionalinterfaces.passwordvalidator;
public interface SecurityUtils {

	static boolean isStrong(String pwd) {
		return pwd.length() >= 8 &&
				pwd.matches(".*[A-Z].*") &&
				pwd.matches(".*[0-9].*");
	}
}
