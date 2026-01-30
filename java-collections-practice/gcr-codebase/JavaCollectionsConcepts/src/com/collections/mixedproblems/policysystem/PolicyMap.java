package com.collections.mixedproblems.policysystem;
import java.time.LocalDate;

public class PolicyMap {
    String id, name, coverage;
    LocalDate expiryDate;
    public PolicyMap(String id, String name, String date, String coverage) {
        this.id = id; this.name = name; this.expiryDate = LocalDate.parse(date); this.coverage = coverage;
    }
    @Override
    public String toString() { 
    	return id + " - " + expiryDate;
    }
}