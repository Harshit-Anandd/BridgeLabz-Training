package com.collections.queueinterface.hospitalsystem;
import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        
        while(true) {
            System.out.println("\n1. Add Patient\n2. Treat Next Patient\n3. Exit");
            int ch = sc.nextInt();
            if (ch == 3) break;
            
            if (ch == 1) {
                System.out.print("Name: "); String n = sc.next();
                System.out.print("Severity (1-10): "); int s = sc.nextInt();
                pq.offer(new Patient(n, s));
            } else if (ch == 2) {
                if(pq.isEmpty()) System.out.println("No patients.");
                else System.out.println("Treating: " + pq.poll());
            }
        }
        sc.close();
    }
}