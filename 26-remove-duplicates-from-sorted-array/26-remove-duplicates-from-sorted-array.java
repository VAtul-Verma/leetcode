class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
        int j=1;
        int cnt=0;
        
        while(j!=nums.length){
            if(nums[i]!=nums[j]){
                nums[cnt]=nums[i];
                cnt++;
                
            }
            i++;
            j++;
        }
        nums[cnt]=nums[j-1];
        return cnt+1;
    }
}