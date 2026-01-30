package com.collections.queueinterface;
import java.util.*;

public class StackUsingQueues {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
        	q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1; q1 = q2; q2 = temp;
    }

    public static void pop() { 
    	if(!q1.isEmpty()) {
    		System.out.println("Popped: " + q1.poll());
    	} else {
    		System.out.println("Empty"); 
    	}
    }
    
    public static void top() { 
    	if(!q1.isEmpty()) {
    		System.out.println("Top: " + q1.peek());
    	} else {
    		System.out.println("Empty"); 
    	}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n1. Push\n2. Pop\n3. Top\n4. Exit");
            int ch = sc.nextInt();
            if (ch == 4) {
            	break;
            } if (ch == 1) { 
            	System.out.print("Enter val: "); push(sc.nextInt()); 
            } else if (ch == 2) {
            	pop();
            } else if (ch == 3) {
            	top();
            }
        }
        sc.close();
    }
}