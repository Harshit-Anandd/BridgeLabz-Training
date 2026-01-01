// Solution for LeetCode #5

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        // Expand around center for each character
        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindrome (single center)
            int len1 = expandAroundCenter(s, i, i);
            
            // Check for even length palindrome (two centers)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length
            int len = Math.max(len1, len2);
            
            // Update start and end indices if longer palindrome found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        // Expand outwards while characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        // Return length of palindrome
        return right - left - 1;
    }
}