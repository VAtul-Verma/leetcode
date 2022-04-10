class Solution {
    public int countNegatives(int[][] grid) {
     int n=grid.length;
        int m=grid[0].length;
        int i=n-1;
        int j=0;
        int cnt=0;
        while(i>=0 && j<m){
            if(grid[i][j]<0){
                cnt=cnt+(m-j);
                i-=1;
                
            }else{
                j+=1;
            }
        }
        return cnt;
    }
}