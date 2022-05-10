class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length,sum=0,maxsum=0,sumsf=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            sumsf+=i*nums[i];
        }
        maxsum=sumsf;
        for(int i=0;i<n;i++){
            sumsf=sumsf-sum+n*nums[i];
            maxsum=Math.max(maxsum,sumsf);
        }
        return maxsum;
    }
}