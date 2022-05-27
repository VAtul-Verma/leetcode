class Solution {
    public int tribonacci(int n,int []dp) {
        if(n<=1)return dp[n]=n;
        if(n==2)return dp[n]=1;
        if(dp[n]!=0)return dp[n];
        dp[n]= tribonacci(n-1,dp)+tribonacci(n-2,dp)+tribonacci(n-3,dp);
        return dp[n];
    }
    public int tribonacci(int n){
        int []dp=new int[n+1];
        return tribonacci(n,dp);
    }
}