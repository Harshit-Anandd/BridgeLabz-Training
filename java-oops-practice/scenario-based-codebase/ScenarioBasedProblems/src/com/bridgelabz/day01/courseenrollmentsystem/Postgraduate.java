package com.bridgelabz.day01.courseenrollmentsystem;

//4. Subclass: Postgraduate
public class Postgraduate extends Student implements Graded {
 public Postgraduate(String name, String id) {
     super(name, id);
 }

 @Override
 public void assignGrade(double score) {
     // PG Logic: Tougher grading curve
     double calculatedGpa = (score / 100) * 3.5; // Cap is lower for hard grading
     setGpa(calculatedGpa);
 }
}