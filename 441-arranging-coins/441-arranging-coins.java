class Solution {
    public int arrangeCoins(int n) {
        long lo=0;
        long hi=n;
        
        while(lo<=hi) {
            long mid=lo+(hi-lo)/2;
            long coins=mid*(mid+1)/2; //coins used
            
            if(coins==n) return (int)mid;
            else if(coins<n) lo=mid+1; //coins used less than limit given ->use more coins ->increase lo
            else hi=mid-1;
        }
        return (int)hi;
    }
}