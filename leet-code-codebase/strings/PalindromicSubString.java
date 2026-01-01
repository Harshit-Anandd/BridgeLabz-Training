// Solution for LeetCode #647

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        // Check all possible centers for palindromes
        for (int center = 0; center < n; center++) {
            // Odd length palindromes (single character center)
            count += expandAndCount(s, center, center);
            
            // Even length palindromes (two character center)
            count += expandAndCount(s, center, center + 1);
        }
        
        return count;
    }
    
    private int expandAndCount(String s, int left, int right) {
        int count = 0;
        
        // Expand outwards while characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        
        return count;
    }
}