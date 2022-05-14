class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        int maxlen=0;
        for(int i=0;i<n;i++){
            maxlen=Math.max(maxlen,helper(nums,i,dp));
        }
        return maxlen;
    }
    public static int helper(int []arr,int i,int []dp){
        if(dp[i]!=0){
            return dp[i];
        }
        int maxlen=1; ///same index start and end on same index
        for(int j=i-1;j>=0;j--){
            if(arr[j]<arr[i]){
                int recans=helper(arr,j,dp);
                maxlen=Math.max(recans+1,maxlen);
            }
        }
        return dp[i]=maxlen;
    }
}