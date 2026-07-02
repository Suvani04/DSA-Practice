class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int profit =0;
        int minPrices=Integer.MAX_VALUE;
        int n = prices.length;
        for(int i =0; i<n ;i++){
            if(prices[i] < minPrices){
                minPrices= prices[i];
            }else{
                profit = prices[i]-minPrices;
                if(profit >maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}