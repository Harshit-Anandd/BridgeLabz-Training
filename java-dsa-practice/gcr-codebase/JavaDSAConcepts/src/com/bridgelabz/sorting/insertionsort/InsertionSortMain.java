package com.bridgelabz.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSortMain {

    public static void main(String[] args) {
        int[] employeeIds = {1054, 1023, 1089, 1011, 1045};
        System.out.println("Original IDs: " + Arrays.toString(employeeIds));
        
        EmployeeIDSorter.insertionSort(employeeIds);
        
        System.out.println("Sorted IDs: " + Arrays.toString(employeeIds));
    }
    
}
