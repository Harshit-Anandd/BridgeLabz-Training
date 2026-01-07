package com.bridgelabz.searching.binarysearch.searchmatrix;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Map 1D index back to 2D
            int midVal = matrix[mid / cols][mid % cols]; 

            if (midVal == target) return true;
            if (midVal < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println("Found 3: " + searchMatrix(matrix, 3)); // true
    }
}