class Solution {
    public int combinationSum4(int[] nums, int target) {
        int []dp=new int[target+1];
        return combinationSum4h(nums,target,dp);
    }
    public int combinationSum4h(int []nums,int tar,int []dp){
        dp[0]=1;
         for(int tr=1;tr<=tar;tr++){
        for(int num:nums){
           
                if(tr-num>=0){
                dp[tr]+=dp[tr-num];
                }
            }
        }
        return dp[tar];
    }
}