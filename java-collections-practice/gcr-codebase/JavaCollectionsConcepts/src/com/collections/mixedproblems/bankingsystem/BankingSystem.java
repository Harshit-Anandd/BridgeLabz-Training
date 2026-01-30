package com.collections.mixedproblems.bankingsystem;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> accounts = new HashMap<>();
        Queue<Integer> withdrawals = new LinkedList<>(); // Process requests
        
        while(true) {
            System.out.println("\n1. Add Account\n2. Request Withdrawal\n3. Process Withdrawals\n4. Show Sorted Accounts\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 5) break;
            
            if (ch == 1) {
                System.out.print("Acc No: "); int acc = sc.nextInt();
                System.out.print("Balance: "); double bal = sc.nextDouble();
                accounts.put(acc, bal);
            } else if (ch == 2) {
                System.out.print("Acc No for Withdrawal: ");
                withdrawals.offer(sc.nextInt());
            } else if (ch == 3) {
                while(!withdrawals.isEmpty()) {
                    int acc = withdrawals.poll();
                    if(accounts.containsKey(acc)) {
                        accounts.put(acc, accounts.get(acc) - 100); // Dummy deduction
                        System.out.println("Processed 100 from " + acc);
                    } else System.out.println("Invalid Acc " + acc);
                }
            } else if (ch == 4) {
                // Sort by Balance
                List<Map.Entry<Integer, Double>> list = new ArrayList<>(accounts.entrySet());
                list.sort(Map.Entry.comparingByValue());
                System.out.println("Accounts sorted by balance: " + list);
            }
        }
        sc.close();
    }
}