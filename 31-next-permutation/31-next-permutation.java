class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return ;
        }
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
        int j=nums.length-1;
        while(nums[i]>=nums[j]){
            j--;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }
        reverse(nums,i+1,nums.length-1);
    }
    public static void reverse(int []nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}