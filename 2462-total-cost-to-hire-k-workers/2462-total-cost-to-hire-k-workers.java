class Solution {
    public long totalCost(int[] costs, int r, int candidates) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        long res = 0;
        int j=0, k=costs.length-1;
        if(r>=costs.length){
            for(int i=0; i<costs.length; ++i){
                res += costs[i];
            }
            return res;
        }
        while(j<k && j<candidates){
            pq.offer(new int[]{costs[j], j});
            pq.offer(new int[]{costs[k], k});
            j++;
            k--;
        }
        for(int i=0; i<r && pq.size()>0; ++i){
            int[] c = pq.poll();
            res += c[0];
            int ind = c[1];
            if(ind<j && j<=k){
                pq.offer(new int[]{costs[j], j});
                j++;
            }else if(ind>k && j<=k){
                pq.offer(new int[]{costs[k], k});
                k--;
            }
        }
        
        return res;
    }
}