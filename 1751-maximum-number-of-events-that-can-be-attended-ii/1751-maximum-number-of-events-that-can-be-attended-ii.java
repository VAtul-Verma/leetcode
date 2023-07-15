class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a,b) -> {
            if (a[0]==b[0])  return a[1]-b[1];
            return a[0] - b[0]; 
        });
        return helper(events, k, 0, -1, new Integer[k+1][events.length+1]);
    }
    
    private int helper(int[][] events, int k, int idx, int prevEventIdx, Integer[][] cache) {
        if (k == 0) return 0;
        if (idx >= events.length) return 0;
        
        if (cache[k][prevEventIdx + 1] != null)
            return cache[k][prevEventIdx+1];
        
        // two options
        int attend = 0;
        if (prevEventIdx == -1 || canAttendEvent(events[idx], events[prevEventIdx])) {
            attend = events[idx][2] + helper(events, k - 1, idx + 1, idx, cache);
        }

        int skip = helper(events, k, idx + 1, prevEventIdx, cache);
        return cache[k][prevEventIdx+1] = Math.max(skip, attend); 
    }
    
    private boolean canAttendEvent(int[] event, int[] prev) {
        int endTime = prev[1], startTime = event[0];
        return endTime < startTime;
    }
}