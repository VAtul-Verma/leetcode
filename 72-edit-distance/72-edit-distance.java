class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
         return helper(word1,word2,n,m,dp);
    }
    public int helper(String s1,String s2,int n,int m,int [][]dp){
        if(n==0 || m==0){
            return dp[n][m]=n!=0?n:m;
        }
        if(dp[n][m]!=0)return dp[n][m];
        
        int a=helper(s1,s2,n-1,m-1,dp);   //replace call;
         int b=helper(s1,s2,n,m-1,dp); //insert call;
         int c=helper(s1,s2,n-1,m,dp); //delete call;
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=a;
        }else{
            return dp[n][m]=Math.min(Math.min(a,b),c)+1;
        }
    }
}