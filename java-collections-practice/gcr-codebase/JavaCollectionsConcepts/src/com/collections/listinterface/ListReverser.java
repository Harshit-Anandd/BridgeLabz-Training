package com.collections.listinterface;
import java.util.*;

public class ListReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1. Use ArrayList\n2. Use LinkedList\n3. Exit");
            System.out.print("Enter choice: ");
            int type = sc.nextInt();
            
            if (type == 3) break;
            
            if (type == 2) list = new LinkedList<>();
            else list = new ArrayList<>();
            
            System.out.println("Enter numbers (enter -1 to stop):");
            while (true) {
                int num = sc.nextInt();
                if (num == -1) break;
                list.add(num);
            }
            
            System.out.println("Original: " + list);
            
            // Custom reverse logic without Collections.reverse
            for (int i = 0; i < list.size() / 2; i++) {
                Integer temp = list.get(i);
                list.set(i, list.get(list.size() - 1 - i));
                list.set(list.size() - 1 - i, temp);
            }
            
            System.out.println("Reversed: " + list);
            list.clear();
        }
        sc.close();
    }
}