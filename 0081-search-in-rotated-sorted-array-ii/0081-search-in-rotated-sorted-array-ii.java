class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target)return true;
            if((nums[l]==nums[mid]) && (nums[r]==nums[mid])){  //dublicate case where we can't decide where we go
                l++;
                r--;
                                                        }
            else if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){  //left part is sorted
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(nums[mid]<target && nums[r]>=target){  //right part is sorted
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
}