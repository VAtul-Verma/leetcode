class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length<3){
            return 0;
            
        }
        int  ans=0;
         Arrays.sort(nums);
        reverser(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]<nums[i+1]+nums[i+2]){
              ans= Math.max(ans,nums[i]+nums[i+1]+nums[i+2]);
                break;
            }
        }
        return ans;
    }
    public static void reverser(int []arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}