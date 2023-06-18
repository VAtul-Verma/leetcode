class Solution {
     int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};
    long res;
    int mod = 1000000007;
	
    public int countPaths(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        res = 0;
        // memo[i][j] represents the number of increasing path start at index(i, j)
        long[][] memo = new long[m][n];
        // iterate from each cell
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // haven't calculate total increasing path starting from current cell
                if(memo[i][j] == 0) dfs(grid, memo, i, j);
            }
        }
        return (int) (1L * res % mod);
    }
    
    private long dfs(int[][] grid, long[][] memo, int x, int y){
        if(memo[x][y] != 0) return memo[x][y];
        // grid[x][y] itself is an increasing path
        long total = 1;
        // iterate 4 directions
        for(int i = 0; i < 4; i++){
            int row = x + dx[i];
            int col = y + dy[i];
            // out of index || not an increasing path
            if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length 
               || grid[x][y] >= grid[row][col]) continue;
            // dfs
            total += dfs(grid, memo, row, col) % mod;
        }
        // update memo
        memo[x][y] = total % mod;
        res += total % mod;
        return total % mod;
    }
}