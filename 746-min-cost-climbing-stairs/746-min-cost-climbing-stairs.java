class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return minCostClimbingStairshelper(cost.length,cost,dp);
    }
    public int minCostClimbingStairshelper(int N,int []cost,int []dp){
        for(int i=0;i<=N;i++){
            if(i<=1){dp[i]=cost[i];
                     continue;}
        
        int fcall=dp[i-1];
        int scall=dp[i-2];
        int ans=Math.min(fcall,scall)+(i==cost.length?0:cost[i]);
         dp[i]= ans;
        }
        return dp[N];
    }
    
    //dp memo
    //  public int minCostClimbingStairshelper(int n,int []cost,int []dp){
    //     if(n<=1)return dp[n]=cost[n];
    //     if(dp[n]!=0)return dp[n];
    //     int fcall=minCostClimbingStairshelper(n-1,cost,dp);
    //     int scall=minCostClimbingStairshelper(n-2,cost,dp);
    //     int ans=Math.min(fcall,scall)+(n==cost.length?0:cost[n]);
    //     return dp[n]= ans;
    // }
}