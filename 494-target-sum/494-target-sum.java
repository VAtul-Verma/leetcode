class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        if(n==0)return 0;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(target<-sum || target>sum)return 0;
        int [][]dp=new int[n+1][2*sum+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        return targetsumhelper(nums,n,sum,target+sum,dp);
    }
    public int targetsumhelper(int []nums,int n,int sum,int tar,int [][]dp){
        if(n==0){
            return dp[n][sum]=(tar==sum)?1:0;
        }
        if(dp[n][sum]!=-1)return dp[n][sum];
        int cnt=0;
        cnt+=targetsumhelper(nums,n-1,sum-nums[n-1],tar,dp); //num is positive
        cnt+=targetsumhelper(nums,n-1,sum+nums[n-1],tar,dp); //nums is negative
        return dp[n][sum]=cnt;

    }
}