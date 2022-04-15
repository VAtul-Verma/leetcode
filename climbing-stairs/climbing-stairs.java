class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            
            int tway=0;
            tway+=i-1>=0?dp[i-1]:0;
            tway+=i-2>=0?dp[i-2]:0;
            
            dp[i]=tway;
        }
        return dp[n];
    }
}