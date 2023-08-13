class Solution {
    public boolean validPartition(int[] nums) {
        return helper(nums, 0);
    }
    
    private boolean helper(int[] nums, int i) {
        while(i < nums.length) {
            int countEqual = 1;
            int j = i+1;
            while(j < nums.length && nums[j] == nums[i]) {
                j++;
                countEqual++;
            }
            if(countEqual >= 5) {
                return helper(nums, j-3);
            }
            
            if(i<nums.length-2 && nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
                return helper(nums, i+2) || helper(nums, i+3);
            }
            if(i == nums.length-1) {
                return false;
            } else if(nums[i] == nums[i+1]) {
                i += 2;
            } else if(i == nums.length-2) {
                return false;
            } else if(nums[i+1]-nums[i] == 1 && nums[i+2]-nums[i+1] == 1) {
                i += 3;
            } else {
                return false;
            }
        }
        return true;
    }
}