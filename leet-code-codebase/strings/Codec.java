// Solution for LeetCode #271

import java.util.*;

public class Codec {
    
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String str : strs) {
            // Encode as: length#string
            encoded.append(str.length()).append('#').append(str);
        }
        
        return encoded.toString();
    }
    
    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            // Find delimiter '#'
            int delimiterIndex = s.indexOf('#', i);
            
            // Extract length
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            
            // Extract string of given length
            String str = s.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            decoded.add(str);
            
            // Move to next encoded string
            i = delimiterIndex + 1 + length;
        }
        
        return decoded;
    }
}