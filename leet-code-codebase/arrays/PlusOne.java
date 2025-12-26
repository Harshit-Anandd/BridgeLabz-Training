// Solution for LeetCode #66

class Solution {
    public int[] plusOne(int[] digits) {
        // Start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set to 0 and continue
            digits[i] = 0;
        }
        
        // All digits were 9, need to create new array with extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // First digit becomes 1, rest are 0
        return result;
    }
}