class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if(k==0)return 0;
        int product=1;
        int start=0;
        int end=0;
        int cnt=0;
        while(end<nums.length){
            product*=nums[end];
            // if(start<=end){
            while(start<=end && product>=k){
                product/=nums[start];
                start++;
            }
            if(product<k){
                cnt+=(end-start+1);
                
            }
            end++;
        }
        return cnt;
    }
}