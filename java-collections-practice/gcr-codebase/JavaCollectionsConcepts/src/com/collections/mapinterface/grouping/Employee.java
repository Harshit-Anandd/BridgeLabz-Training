package com.collections.mapinterface.grouping;

public class Employee {
    String name, dept;
    public Employee(String n, String d) { 
    	name = n;
    	dept = d;
    }
    
    @Override 
    public String toString() { 
    	return name; 
    }
}