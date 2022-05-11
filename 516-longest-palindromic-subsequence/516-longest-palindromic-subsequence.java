class Solution {
    
     public int longestPalindromeSubseq(String S)
    {
        //code here
        int n=S.length();
        int dp[][]=new int[n][n];
        
        int ans=helper(S,0,n-1,dp);
        return ans;
        
    }
    public int helper(String s,int I,int J,int[][]dp){
        int n=s.length();
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                 if(i>=j){
            dp[i][j]=i==j?1:0;
                     continue;
        }
        if(dp[i][j]!=0)return dp[i][j];
        
        int a=dp[i+1][j-1];
        int b=dp[i+1][j];
        int c=dp[i][j-1];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j] =a+2;
        }else{
             dp[i][j]=Math.max(b,c);
        }
            }
        }
       return dp[I][J];
    }
}