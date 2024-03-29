class Solution {
    public boolean PredictTheWinner(int[] arr) {
        if(arr.length <= 1) return true;
        int[]dp = new int[1<<arr.length];
        int tar = 0;
        for(int i=0; i<arr.length; i++) tar += 1 << i;
        int val = solve(arr, 0, dp, tar);
        return val >= 0;
    }
    public int solve(int[]arr, int curr, int[]dp, int tar) {
        if(curr == tar) return 0;               // all integers have been picked
        if(dp[curr] != 0) return dp[curr];      // cache
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {       // finding first unpicked integer
            if((curr & (1 << i)) == 0) {
                max = Math.max(max, arr[i] - solve(arr, (curr | (1 << i)), dp, tar));
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--) {    // finding last unpicked integer
            if((curr & (1 << i)) == 0) {
                max = Math.max(max, arr[i] - solve(arr, (curr | (1 << i)), dp, tar));
                break;
            }
        }
        return dp[curr] = max;
    }
}