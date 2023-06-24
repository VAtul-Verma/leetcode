class Solution {
    public int tallestBillboard(int[] rods) {
        int len = rods.length;
        int sum = 0;
        for(int rod : rods) sum+=rod;
        int[] dp = new int[sum+1];
        for(int i=1; i<=sum; i++)
            dp[i] = -1;
        for(int rod : rods){
            int[] pre = dp.clone();
            for(int j=0; j<=sum-rod; j++){
                if(pre[j] != -1){
                    dp[j+rod] = Math.max(dp[j+rod], pre[j]);
                    dp[Math.abs(j-rod)] = Math.max(dp[Math.abs(j-rod)], pre[j]+Math.min(rod, j));
                }
            }
        }
        return dp[0];
    }
}