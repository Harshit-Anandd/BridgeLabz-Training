package com.day01.resume;

import java.util.Set;

public class ResumeData {
    public String name;
    public String email;
    public String phone;
    public Set<String> keywords;
    public int matchCount;

    public ResumeData(String name, String email, String phone, Set<String> keywords) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.keywords = keywords;
        this.matchCount = keywords.size();
    }

    public String toString() {
        return name + " | " + email + " | " + phone + " | Matches: " + matchCount;
    }
}