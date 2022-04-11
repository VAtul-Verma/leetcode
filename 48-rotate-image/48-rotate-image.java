class Solution {
    public void rotate(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
            
        }
         for(int i=0;i<n;i++){
            int l=0;
            int r=m-1;
            while(l<=r){
                int temp=nums[i][l];
                nums[i][l]=nums[i][r];
                nums[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}