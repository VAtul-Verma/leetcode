class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        int maxlen=helper(nums,dp);
       
        return maxlen;
    }
    public static int helper(int []arr,int []dp){
        int maxlen=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}