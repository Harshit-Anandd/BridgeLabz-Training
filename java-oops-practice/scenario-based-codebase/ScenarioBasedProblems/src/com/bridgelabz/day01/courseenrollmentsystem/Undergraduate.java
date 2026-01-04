package com.bridgelabz.day01.courseenrollmentsystem;

//3. Subclass: Undergraduate
public class Undergraduate extends Student implements Graded {
 public Undergraduate(String name, String id) {
     super(name, id);
 }

 @Override
 public void assignGrade(double score) {
     // UG Logic: Score out of 100 converted to 4.0 scale
     double calculatedGpa = (score / 100) * 4.0;
     setGpa(calculatedGpa); // Uses protected setter
 }
}