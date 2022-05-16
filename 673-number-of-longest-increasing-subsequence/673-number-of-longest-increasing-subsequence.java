class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        int []count=new int[n];
        int maxcnt=0,maxlen=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            count[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                if(dp[j]+1==dp[i])count[i]+=count[j];
                else if(dp[j]+1>dp[i]){
                    count[i]=count[j];
                    dp[i]=dp[j]+1;
                }
                }
            }
            if(maxlen==dp[i]){
                maxcnt+=count[i];
            }else if(dp[i]>maxlen){
                maxlen=dp[i];
                maxcnt=count[i];
            }
        }
        return maxcnt;
    }
}