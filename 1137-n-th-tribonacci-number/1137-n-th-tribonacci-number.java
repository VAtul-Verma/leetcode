class Solution {
    public int tribonacci(int n) {
        int []dp=new int[n+1];
        return tribonaccihelper(n,dp);
    }
    public int tribonaccihelper(int n,int []dp){
        if(n<=1)return dp[n]=n;;
        if(n==2)return dp[2]=1;
        
        if(dp[n]!=0)return dp[n];
        return dp[n]=tribonaccihelper(n-1,dp)+tribonaccihelper(n-2,dp)+tribonaccihelper(n-3,dp);
    }
}