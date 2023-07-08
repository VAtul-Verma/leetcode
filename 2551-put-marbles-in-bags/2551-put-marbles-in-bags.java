class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length - 1;
        PriorityQueue<Integer> maxK = new PriorityQueue<>(k);
        PriorityQueue<Integer> minK = new PriorityQueue<>(k, (a, b) -> b - a);
        int edge;
        for(int i = 1; i <= n; i++) {
            edge = weights[i] + weights[i - 1];
            minK.add(edge);
            maxK.add(edge);
            if (minK.size() == k) {
                minK.poll();
                maxK.poll();
            }
        }
        
        long ans = 0;
        while(--k > 0) {
            ans += maxK.poll() - minK.poll();
        }
        
        return ans;
    }
}