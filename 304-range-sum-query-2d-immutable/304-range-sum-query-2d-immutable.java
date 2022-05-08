class NumMatrix {
    /*
    1 <= i <= m, 1 <= j <= n
    dp[i][j] = matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]
    rH = max(r1, r2) + 1
    cH = max(c1, c2) + 1
    rL = min(r1, r2)
    cL = min(c1, c2)    
    result = dp[rH][cH] - dp[rH][cL] - dp[rL][cH] + dp[rL][cL] 
    */
    int[][] dp; 
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] =  matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rH, rL, cH, cL;
        if(row1 > row2) {
            rH = row1 + 1;
            rL = row2;
        } else {
            rH = row2 + 1;
            rL = row1;
        }
        if(col1 > col2) {
            cH = col1 + 1;
            cL = col2;
        } else {
            cH = col2 + 1;
            cL = col1;            
        }
        return dp[rH][cH] - dp[rH][cL] - dp[rL][cH] + dp[rL][cL];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */