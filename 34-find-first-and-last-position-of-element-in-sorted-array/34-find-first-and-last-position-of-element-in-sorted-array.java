class Solution {
    public int[] searchRange(int[] nums, int target) {
       int []ans=new int[2];
      ans[0]=leftsearch(nums,target);
        ans[1]=rightsearch(nums,target);
        return ans;
       }
    public static int leftsearch(int []nums,int target){
        int idx=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else {
                l=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }  
    
    public static int rightsearch(int []nums,int target){
          int idx=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=target){
                l=mid+1;
            }else{
                r=mid-1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
}