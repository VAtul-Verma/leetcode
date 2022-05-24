class Solution {
    int [][]dir={ {1,0},{0,1},{0,-1},{-1,0}    };
    int mod=1000000007;
    public int findPaths(int n, int m, int k, int startRow, int startColumn) {
        int [][][]dpp=new int[n+1][m+1][k+1];
        for(int [][]dp:dpp){
            for(int []d:dp){
                Arrays.fill(d,-1);
            }
        }
        return findPathshelper(n,m,k,startRow,startColumn,dpp);
    }
     public int findPathshelper(int n, int m, int k, int sr, int sc,int [][][]dp) {
        if(sr<0 || sc<0 || sr==n || sc==m){
            return 1;
        }
         if(k==0)return 0;
         if(dp[sr][sc][k]!=-1)return dp[sr][sc][k];
         int cnt=0;
         for(int []d:dir){
             int r=sr+d[0];
             int c=sc+d[1];
             cnt=(cnt+findPathshelper(n,m,k-1,r,c,dp))%mod;
         }
         return dp[sr][sc][k]=cnt;
    }
}