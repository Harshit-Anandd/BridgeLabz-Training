package com.collections.mixedproblems.policysystem;
import java.util.*;
import java.time.LocalDate;

public class InsuranceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, PolicyMap> policyMap = new HashMap<>();
        Map<LocalDate, List<PolicyMap>> expiryMap = new TreeMap<>(); // Sorted by date

        while (true) {
            System.out.println("\n1. Add Policy\n2. Get by ID\n3. List Expiring (30 Days)\n4. Remove Expired\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 5) break;

            if (ch == 1) {
                System.out.print("ID: "); String id = sc.next();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Expiry (YYYY-MM-DD): "); String date = sc.next();
                System.out.print("Coverage: "); String cov = sc.next();
                PolicyMap p = new PolicyMap(id, name, date, cov);
                
                policyMap.put(id, p);
                expiryMap.putIfAbsent(p.expiryDate, new ArrayList<>());
                expiryMap.get(p.expiryDate).add(p);
            } else if (ch == 2) {
                System.out.print("Enter ID: ");
                System.out.println(policyMap.get(sc.next()));
            } else if (ch == 3) {
                LocalDate limit = LocalDate.now().plusDays(30);
                for (Map.Entry<LocalDate, List<PolicyMap>> entry : expiryMap.entrySet()) {
                    if (entry.getKey().isAfter(LocalDate.now()) && entry.getKey().isBefore(limit)) {
                        System.out.println(entry.getValue());
                    }
                }
            } else if (ch == 4) {
                // Simplified removal
                LocalDate today = LocalDate.now();
                ((TreeMap<LocalDate, List<PolicyMap>>) expiryMap).headMap(today).clear(); // Remove from sorted map
                policyMap.entrySet().removeIf(e -> e.getValue().expiryDate.isBefore(today));
                System.out.println("Expired policies removed.");
            }
        }
        sc.close();
    }
}