class Solution {
    public int maxProfit(int[] prices) {
        int maxproft=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(min<prices[i]){
                maxproft=Math.max(maxproft,prices[i]-min);
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return   maxproft;

    }
}