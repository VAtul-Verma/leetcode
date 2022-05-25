class Solution {
    public int maxSizeSlices(int[] slices) {
        int n=slices.length;
        int [][]dp=new int[n+1][n/3+1];
         int [][]dp1=new int[n+1][n/3+1];
        for(int [] d:dp){
            Arrays.fill(d,-1);
        }
        for(int [] d:dp1){
            Arrays.fill(d,-1);
        }
        
        return Math.max(maxSizeSlices_helper(slices,0,n-2,n/3,dp),maxSizeSlices_helper(slices,1,n-1,n/3,dp1));
    }
     public int maxSizeSlices_helper(int[] slices,int si,int ei,int numofslice,int [][]dp) {
        if(si>ei || numofslice==0)return 0;
         if(dp[ei][numofslice]!=-1)return dp[ei][numofslice];
         
         int take=maxSizeSlices_helper(slices,si,ei-2,numofslice-1,dp)+slices[ei];
         int notake=maxSizeSlices_helper(slices,si,ei-1,numofslice,dp);
         
         return dp[ei][numofslice]=Math.max(take,notake);
    }
}
