// Solution for LeetCode #7

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            // Get last digit
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE/10 || 
                (reversed == Integer.MAX_VALUE/10 && digit > 7)) {
                return 0; // Overflow for positive
            }
            
            if (reversed < Integer.MIN_VALUE/10 || 
                (reversed == Integer.MIN_VALUE/10 && digit < -8)) {
                return 0; // Overflow for negative
            }
            
            // Update reversed number
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
}