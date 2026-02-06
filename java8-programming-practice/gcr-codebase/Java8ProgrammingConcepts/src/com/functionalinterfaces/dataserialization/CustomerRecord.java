package com.functionalinterfaces.dataserialization;

//Class marked for backup
public class CustomerRecord implements BackupEligible {

	private String name;

	public CustomerRecord(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
