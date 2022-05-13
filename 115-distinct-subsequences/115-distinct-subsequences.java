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
    public int helper(String s1,String s2,int n,int m,int [][]dp){
       if(m==0)return dp[n][m]=1;
        else if(n==0)return dp[n][m]=0;   //no way to found answer
        if(dp[n][m]!=-1)return dp[n][m];
        int a=helper(s1,s2,n-1,m-1,dp)  ; //when character are same
        int b=helper(s1,s2,n-1,m,dp);
      
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=a+b;
        }else{
            return dp[n][m]=b;
        }
    }
}