class Solution {
    public int pivotIndex(int[] nums) {
        // approach :find the right sum which is all element sum 
        //start from left side in array and if(leftsum==rightsum)return index 
        //if there is no way where leftsum==rightsum return -1
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            leftsum+=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            rightsum-=nums[i];
        }
        return -1;
    }
}