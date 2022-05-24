class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int [][]dp=new int[n+1][n+1];
        return minScoreTriangulation_Helper(values,0,n-1,dp);
    }
     public int minScoreTriangulation_Helper(int[] values,int si,int ei,int[][]dp) {
        if(ei-si<2)return dp[si][ei]=0;
         if(dp[si][ei]!=0)return dp[si][ei];
         
         int minRes=(int)1e9;
         for(int cut=si+1;cut<ei;cut++){
             int leftres=minScoreTriangulation_Helper(values,si,cut,dp);
             int rightres=minScoreTriangulation_Helper(values,cut,ei,dp);
             minRes=Math.min(minRes,leftres+values[si]*values[cut]*values[ei]+rightres);
         }
         return dp[si][ei]=minRes;
     }
}