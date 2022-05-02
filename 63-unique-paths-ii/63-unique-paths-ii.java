class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
         int [][]dp=new int[n][m];
        int [][]dir={{-1,0},{0,-1}};
        int er=n-1;
        int ec=m-1;
        if(obstacleGrid[er][ec]==1 || obstacleGrid[0][0]==1)return 0;
        return uniquepath(er,ec,dir,dp,obstacleGrid);
    }
     public int uniquepath(int er,int ec,int [][]dir,int [][]dp,int [][]grid){
       // if(grid[er][ec]==1)return 0;
         
         if (er==0 && ec == 0) {
            return dp[er][ec] = 1;
        }
         
        if (dp[er][ec] != 0)
            return dp[er][ec];

        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = er + dir[d][0];
            int c = ec + dir[d][1];
            if (r >= 0 && c >= 0 && r < dp.length && c < dp[0].length && grid[r][c]==0) {
                count += uniquepath(r, c,dir,dp,grid);
            }
        }

        return dp[er][ec] = count;
     }
}