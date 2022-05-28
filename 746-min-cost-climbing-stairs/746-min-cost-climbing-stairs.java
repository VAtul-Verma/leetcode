class Solution {
    public int minCostClimbingStairs(int[] cost) {
     int n=cost.length;
        int dp[]=new int[n+1];
        return minCostClimbingStairs(cost.length,cost,dp) ;
    }
     public int minCostClimbingStairs(int n,int[] cost,int []dp) {
        if(n<=1)return dp[n]=cost[n];
         if(dp[n]!=0)return dp[n];
         int fcall=minCostClimbingStairs(n-1,cost,dp);
         int scall=minCostClimbingStairs(n-2,cost,dp);
         int ans=Math.min(fcall,scall)+(n==cost.length?0:cost[n]);
        return dp[n]=ans;
    }
}