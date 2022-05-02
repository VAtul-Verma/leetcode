class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public boolean check(int nums[][],int [][]tar){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i][j]!=tar[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void rotate(int[][] nums) {
    transform(nums);
        for(int i=0;i<nums.length;i++){
            reverseRow(nums[i]);
        }
        
    }
    public void transform(int [][]nums){
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<=i;j++){
            int temp=nums[i][j];
            nums[i][j]=nums[j][i];
            nums[j][i]=temp;
        }
    }
    }
    public void reverseRow(int [] nums){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

}