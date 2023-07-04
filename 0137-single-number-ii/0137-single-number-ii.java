class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int res= Integer.MIN_VALUE;
        for(int i=1;i<nums.length-1;i++){
            int start = i-1>=0?i-1:0;
            int end = i+1<nums.length?i+1:nums.length-1;
            if(nums[start]!=nums[i]&&nums[i]!=nums[end]){
               res=nums[i]; 
            }    
        }
        if(res==Integer.MIN_VALUE){
            if(nums[0]!=nums[1]){
                res=nums[0];
            }
            if(nums[nums.length-1]!=nums[nums.length-2]){
                res=nums[nums.length-1];
            }
        }
        return res;
    }
}