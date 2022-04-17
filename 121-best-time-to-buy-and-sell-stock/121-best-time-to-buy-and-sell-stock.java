class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return profit;
    }
}