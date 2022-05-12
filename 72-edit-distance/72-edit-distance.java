class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
         return helper(word1,word2,n,m,dp);
    }
    public int helper(String s1,String s2,int N,int M,int [][]dp){
        for(int n=0;n<=N;n++){
            for(int m=0;m<=M;m++){
                 if(n==0 || m==0){
             dp[n][m]=n!=0?n:m;
                     continue;
        }
       
        
        int a=dp[n-1][m-1];   //replace call;
         int b=dp[n-1][m] ;//insert call;
         int c=dp[n][m-1]; //delete call;
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
           dp[n][m]=a;
        }else{
            dp[n][m]=Math.min(Math.min(a,b),c)+1;
        }
            }
        }
        return dp[N][M];
       
    }
}