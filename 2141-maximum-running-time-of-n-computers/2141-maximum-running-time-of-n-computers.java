class Solution {
    public boolean isPossible(int n, int[] batteries, long mid){
        long duration = 0;
        for(int ele : batteries){
            if(ele < mid) duration += ele;
            else duration += mid;
        }
        return duration >= mid*n;
    }
    
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        long ans=0;
        for(int ele:batteries) sum+=ele;
        long start=0, end = sum;
        
        while(start <= end){
            long mid = start + (end-start)/2;
            
            if(isPossible(n,batteries,mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
        
    
}