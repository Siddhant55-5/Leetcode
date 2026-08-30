class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int maxProfit = 0;
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i]>prices[j]){
                profit = prices[i]-prices[j];
               
                 maxProfit += Math.max(0,profit);
            }
            j++;
           
        }
        return maxProfit;
    }
}