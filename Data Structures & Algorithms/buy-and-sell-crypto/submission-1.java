class Solution {
    public int maxProfit(int[] prices) {
        int left=0,sum=0, max=0;
        int n = prices.length;
        for(int i=0;i<n-1;i++)
        {
            sum += prices[i+1] - prices[i];
            if(sum<0) sum=0;
            max = Math.max(max,sum);
        }
        return max;
    }
}
