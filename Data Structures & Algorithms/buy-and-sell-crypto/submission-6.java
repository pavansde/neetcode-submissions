class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1, max=0;
        int n = prices.length;
        while(right<n)
        {
            if(prices[left]<prices[right])
            {
                int profit= prices[right]-prices[left];
                max = Math.max(max,profit);
            }
            else left = right;
            right++;
        }
        return max;
    }
}
