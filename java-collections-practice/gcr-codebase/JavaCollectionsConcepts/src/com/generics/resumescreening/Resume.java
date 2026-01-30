package com.generics.resumescreening;

//Generic class bounded to JobRole
public class Resume<T extends JobRole> {
	private String candidateName;
	private T role;

	public Resume(String candidateName, T role) {
		this.candidateName = candidateName;
		this.role = role;
	}

	public String getInfo() {
		return "Candidate: " + candidateName + " | Role: " + role.getRoleName();
	}
}