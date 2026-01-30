package com.collections.queueinterface;
import java.util.*;

public class QueueReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        
        System.out.println("Enter elements (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; queue.offer(n); }
        
        System.out.println("Original: " + queue);
        
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()) stack.push(queue.poll());
        while(!stack.isEmpty()) queue.offer(stack.pop());
        
        System.out.println("Reversed: " + queue);
        sc.close();
    }
}