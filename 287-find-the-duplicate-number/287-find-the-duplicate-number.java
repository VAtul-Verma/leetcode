class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length-1]; // 0-n
        
        for (int i = 0; i<nums.length; i++){
            count[nums[i]-1]++;
            if(count[nums[i]-1] == 2){
                return nums[i];
            }
        }
        
        return 0;
    }
}