// Solution for LeetCode #28

class Solution {
    public int strStr(String haystack, String needle) {
        // Edge cases
        if (needle.isEmpty()) {
            return 0;
        }
        
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        // Sliding window approach
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring matches needle
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            
            // If complete match found
            if (j == needle.length()) {
                return i;
            }
        }
        
        // Needle not found
        return -1;
    }
}