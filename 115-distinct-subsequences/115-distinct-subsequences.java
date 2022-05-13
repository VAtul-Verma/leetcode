class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int [][]dp=new int[n+1][m+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        return helper(s,t,n,m,dp);
    }
    public int helper(String s1,String s2,int N,int M,int [][]dp){
        for(int n=0;n<=N;n++){
            for(int m=0;m<=M;m++){
        if(m==0) {
            dp[n][m]=1;
            continue;
        }
        else if(n==0){
             dp[n][m]=0;
            continue;
        }   
       
        int a=dp[n-1][m-1]  ; //when character are same
        int b=dp[n-1][m];
      
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=a+b;
        }else{
         dp[n][m]=b;
        }
            }
        }
        return dp[N][M];
      
    }
}