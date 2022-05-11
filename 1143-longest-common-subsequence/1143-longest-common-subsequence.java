class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        
       int ans=longestCommonSubsequence_memo(s1,s2,n,m,dp);
       
        return ans;
        
    }
    public static int longestCommonSubsequence_memo(String s1,String s2,int N,int M,int [][]dp){
        for(int n=0;n<=N;n++){
            for(int m=0;m<=M;m++){
                if(n==0 || m==0){
             dp[n][m]=0;//no common subsequence
            continue;
                }
        int a=dp[n-1][m-1];
        int b=dp[n][m-1];
        int c=dp[n-1][m];
        if(s1.charAt(n-1)==s2.charAt(m-1)){
             dp[n][m]=a+1;
        }else{
        dp[n][m]=Math.max(b,c);
        } 
            }
        }
        return dp[N][M];
       
    
        
    }
}