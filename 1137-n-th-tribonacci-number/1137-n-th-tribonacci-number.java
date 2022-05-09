class Solution {
    public int tribonacci(int n) {
        int []dp=new int[n+1];
        return tribonaccihelper(n,dp);
    }
    public int tribonaccihelper(int n,int []dp){
        for(int i=0;i<=n;i++){
        if(i<=1){
            dp[i]=i;
            continue;
        }
        if(i==2){
            dp[i]=1;
            continue;
        }
        
       
         dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            
        }
        return dp[n];
    }
}