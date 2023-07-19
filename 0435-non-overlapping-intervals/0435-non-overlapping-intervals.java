class Solution {
    public  class Interval implements Comparable<Interval>{
        int start;
        int end;
        Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
        public int compareTo(Interval other){
            return this.end-other.end;
        }
    }
    public int eraseOverlapIntervals(int[][] nums) {
        int n=nums.length;
        Interval[]interval=new Interval[n];
        for(int i=0;i<n;i++){
            interval[i]=new Interval(nums[i][0],nums[i][1]);
        }
        
        Arrays.sort(interval);
        int limit=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(limit<=interval[i].start){
                limit=interval[i].end;
                cnt++;
            }
        }
        return n-cnt;
    }
}