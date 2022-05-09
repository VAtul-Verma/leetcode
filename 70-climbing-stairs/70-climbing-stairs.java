class Solution {
    
     public int climbStairs(int n) {
       int dp[]=new int[n+1];
         return climbStairshelper(n,dp);
        
    }
    public int climbStairshelper(int n,int []dp) {
       if(n<0)return dp[0]=0;
        if(n==0)return dp[n]= 1;
        if(dp[n]!=0)return dp[n];
        
        return dp[n]=climbStairshelper(n-1,dp)+climbStairshelper(n-2,dp);
        
    }
    
}