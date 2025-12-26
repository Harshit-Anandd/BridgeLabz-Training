// Solution for LeetCode #121

class Solution {
    public int maxProfit(int[] prices) {
        // Initialize minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Iterate through prices
        for (int i = 0; i < prices.length; i++) {
            // Update minimum price if current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate potential profit and update maxProfit if higher
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}