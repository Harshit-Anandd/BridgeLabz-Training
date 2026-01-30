package com.collections.queueinterface.hospitalsystem;

public class Patient implements Comparable<Patient> {
    String name;
    int severity; // Higher number = higher priority
    public Patient(String name, int severity) { this.name = name; this.severity = severity; }
    
    // Reverse logic because PriorityQueue is min-heap by default, we need max-heap behavior
    @Override 
    public int compareTo(Patient p) { 
    	return Integer.compare(p.severity, this.severity); 
    }
    
    @Override 
    public String toString() { 
    	return name + " (Sev: " + severity + ")"; 
    }
}