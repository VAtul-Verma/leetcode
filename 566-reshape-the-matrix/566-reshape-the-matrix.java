class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n=nums.length;
        int m=nums[0].length;
        if(n*m!=r*c){
            return nums;
        }
     
        int [][]ans=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                ans[row][col]=nums[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return ans;
    }
}