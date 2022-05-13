class Solution {
    public int minDistance(String s, String t) {
         int n=s.length();
        int m=t.length();
        int [][]dp=new int[n+1][m+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        int ans= helper(s,t,n,m,dp);
        return n+m-2*ans;
    }
    public int helper(String s1,String s2,int n,int m,int [][]dp){
        if(n==0 || m==0){
          return dp[n][m]=0;
        }
        
        
        if(dp[n][m]!=-1){
            return dp[n][m];
            
        }
        
        int a=helper(s1,s2,n-1,m-1,dp);
        int b=helper(s1,s2,n-1,m,dp);
        int c= helper(s1,s2,n,m-1,dp);
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=a+1;
        }else{
            return dp[n][m]=Math.max(b,c);
        }
    }
}