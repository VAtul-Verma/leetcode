class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                ele=nums[i];
                
            }
            if(ele==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return ele;
    }
}