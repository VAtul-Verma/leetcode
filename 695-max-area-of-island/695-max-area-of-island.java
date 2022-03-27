class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean [][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(grid[i][j]==1 && vis[i][j]==false){
                ans=Math.max(ans,findarea(grid,vis,i,j));
            }
            }
        }
        return ans;
    }
    int []di={-1,0,1,0};
    int []dj={0,1,0,-1};
    public int findarea(int [][]grid,boolean [][]vis,int sr,int sc){
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length){
            return 0;
        }
        int ans=0;
        if(grid[sr][sc]==0 || vis[sr][sc])return 0;
        vis[sr][sc]=true;
        for(int d=0;d<4;d++){
            ans+=findarea(grid,vis,sr+di[d],sc+dj[d]);
        }
        return ans+1;
        
    }
}