class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n][n];
        return maxCoins_helper(nums,0,n-1,dp);
    }
    public int maxCoins_helper(int[] nums,int si,int ei,int [][]dp) {
        if(dp[si][ei]!=0)return dp[si][ei];
        int lele=si==0?1:nums[si-1];
        int rele=ei==nums.length-1?1:nums[ei+1];
        int mcoins=0;
        for(int cut=si;cut<=ei;cut++){
            int lcost=cut==si?0:maxCoins_helper(nums,si,cut-1,dp);
            int rcost=cut==ei?0:maxCoins_helper(nums,cut+1,ei,dp);
            mcoins=Math.max(mcoins,lcost+lele*nums[cut]*rele+rcost);
        }
        return dp[si][ei]=mcoins;
    }
}