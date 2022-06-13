class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        boolean [][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                cnt++;
                dfs(grid,vis,i,j);
                }
            }
        }
        return cnt;
    }
    public static void dfs(char[][]grid,boolean[][]vis,int i,int j){
        
         int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
       
        for(int d=0;d<dir.length;d++){
            int r=i+dir[d][0];
            int c=j+dir[d][1];
            
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && vis[r][c]==false && grid[r][c]=='1'){
                vis[r][c]=true;
                dfs(grid,vis,r,c);
                
            }
        }
    }
}