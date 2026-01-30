package com.collections.setinterface.policymanagement;
import java.time.LocalDate;

public class Policy implements Comparable<Policy> {
    String id, name, coverage;
    double premium;
    LocalDate expiryDate;

    public Policy(String id, String name, String date, String coverage, double premium) {
        this.id = id;
        this.name = name;
        this.expiryDate = LocalDate.parse(date);
        this.coverage = coverage;
        this.premium = premium;
    }

    @Override
    public String toString() { return id + " | " + name + " | " + expiryDate + " | " + coverage; }

    // Required for HashSet uniqueness
    @Override
    public int hashCode() { return id.hashCode(); }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy p = (Policy) o;
        return id.equals(p.id);
    }
    // Required for TreeSet
    @Override
    public int compareTo(Policy o) { return this.expiryDate.compareTo(o.expiryDate); }
}