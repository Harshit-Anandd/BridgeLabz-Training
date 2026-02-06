package com.streams.membership;
import java.time.LocalDate;

public class Member {

	private String name;
	private LocalDate expiry;

	public Member(String name, LocalDate expiry) {
		this.name = name;
		this.expiry = expiry;
	}

	public LocalDate getExpiry() { 
		return expiry; 
	}

	public String toString() {
		return name + " expires on " + expiry;
	}
}
