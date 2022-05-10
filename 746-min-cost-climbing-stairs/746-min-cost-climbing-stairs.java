class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return minCostClimbingStairshelper(cost.length,cost,dp);
    }
    public int minCostClimbingStairshelper(int n,int []cost,int []dp){
        if(n<=1)return dp[n]=cost[n];
        if(dp[n]!=0)return dp[n];
        int fcall=minCostClimbingStairshelper(n-1,cost,dp);
        int scall=minCostClimbingStairshelper(n-2,cost,dp);
        int ans=Math.min(fcall,scall)+(n==cost.length?0:cost[n]);
        return dp[n]= ans;
    }
}