class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        for(int j = 1;j<prices.length;j++){
            int profit = prices[j] - prices[i];
            if(prices[j]<prices[i]){
                i=j;
            }
            maxProfit = Math.max(profit,maxProfit);
            
                }
              return maxProfit;
                }
               
        
    }
