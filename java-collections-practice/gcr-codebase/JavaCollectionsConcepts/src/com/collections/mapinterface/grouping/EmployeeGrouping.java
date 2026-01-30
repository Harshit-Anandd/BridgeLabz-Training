package com.collections.mapinterface.grouping;
import java.util.*;

public class EmployeeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emps = new ArrayList<>();
        
        System.out.println("Enter Employee Name and Dept ('done' to stop):");
        while(true) {
            String n = sc.next();
            if(n.equals("done")) break;
            String d = sc.next();
            emps.add(new Employee(n, d));
        }
        
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee e : emps) {
            grouped.putIfAbsent(e.dept, new ArrayList<>());
            grouped.get(e.dept).add(e);
        }
        
        System.out.println("Grouped: " + grouped);
        sc.close();
    }
}