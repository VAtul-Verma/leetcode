class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
       return longestCommonSubsequence_memo(s1,s2,n,m,dp);
        
        
    }
    public static int longestCommonSubsequence_memo(String s1,String s2,int n,int m,int [][]dp){
        if(n==0 || m==0){
            return dp[n][m]=0;    //no common subsequence
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        int a=longestCommonSubsequence_memo(s1,s2,n-1,m-1,dp);
        int b=longestCommonSubsequence_memo(s1,s2,n-1,m,dp);
        int c=longestCommonSubsequence_memo(s1,s2,n,m-1,dp);
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=a+1;
        }else{
            return dp[n][m]=Math.max(b,c);
        }
    }
}