class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        if(sum%2!=0)return false;
        int n=nums.length;
        int tar=sum/2;
        boolean [][]dp=new boolean[n+1][tar+1];
        return target_dp(nums,n,tar,dp);
        
    }
    public boolean target_dp(int []arr,int N,int Tar,boolean [][]dp){
        for(int n=0;n<=N;n++){
            for(int tar=0;tar<=Tar;tar++){
                if(n==0 || tar==0){
                    dp[n][tar]=(tar==0);
                    continue;
                }
                if(tar-arr[n-1]>=0){
                    dp[n][tar]=dp[n][tar] || dp[n-1][tar-arr[n-1]];
                }
                 dp[n][tar]=dp[n][tar] || dp[n-1][tar];
                }
            }
        return dp[N][Tar];
        }
    }
