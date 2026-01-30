package com.collections.setinterface.policymanagement;
import java.util.*;
import java.time.LocalDate;

public class InsuranceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        while (true) {
            System.out.println("\n1. Add Policy\n2. View All (Unique)\n3. View Sorted by Expiry\n4. View Expiring Soon (30 days)\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 5) break;

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: "); String id = sc.next();
                    System.out.print("Enter Name: "); String name = sc.next();
                    System.out.print("Enter Expiry (YYYY-MM-DD): "); String date = sc.next();
                    System.out.print("Enter Coverage: "); String cov = sc.next();
                    System.out.print("Enter Premium: "); double prem = sc.nextDouble();
                    Policy p = new Policy(id, name, date, cov, prem);
                    
                    if(hashSet.add(p)) {
                        linkedSet.add(p);
                        treeSet.add(p);
                        System.out.println("Policy Added.");
                    } else System.out.println("Duplicate Policy ID.");
                    break;
                case 2:
                    System.out.println("Insertion Order (LinkedHashSet):");
                    for (Policy pol : linkedSet) System.out.println(pol);
                    break;
                case 3:
                    System.out.println("Sorted by Expiry (TreeSet):");
                    for (Policy pol : treeSet) System.out.println(pol);
                    break;
                case 4:
                    System.out.println("Expiring within 30 days:");
                    LocalDate limit = LocalDate.now().plusDays(30);
                    for (Policy pol : treeSet) {
                        if (pol.expiryDate.isBefore(limit) && pol.expiryDate.isAfter(LocalDate.now()))
                            System.out.println(pol);
                    }
                    break;
            }
        }
        sc.close();
    }
}