class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0, r = (int)1e9, m = 0;
        int ans = Integer.MAX_VALUE;
        
        while(l <= r) {
            m = l + (r - l)/2;
            
            int i = 0;
            int pairs = 0;
            while(i < n-1) {
                if(nums[i+1] - nums[i] <= m) {
                    pairs++;
                    i += 2;
                } else {
                    i++;
                }
            }
            
            if(pairs < p) {
                l = m + 1;
            } else {
                ans = Math.min(ans, m);
                r = m - 1;
            }
        }
        
        return ans;
    }
}