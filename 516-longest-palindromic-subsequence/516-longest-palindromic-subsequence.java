class Solution {
    
     public int longestPalindromeSubseq(String S)
    {
        //code here
        int n=S.length();
        int dp[][]=new int[n][n];
        
        int ans=helper(S,0,n-1,dp);
        return ans;
        
    }
    public int helper(String s,int i,int j,int[][]dp){
        if(i>=j){
            return dp[i][j]=i==j?1:0;
        }
        if(dp[i][j]!=0)return dp[i][j];
        
        int a=helper(s,i+1,j-1,dp);
        int b=helper(s,i+1,j,dp);
        int c=helper(s,i,j-1,dp);
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=a+2;
        }else{
            return dp[i][j]=Math.max(b,c);
        }
    }
}