class Solution {
    public boolean isPowerOfFour(int n) {
        if(!isPowerOfTwo(n))return false;
        int cnt=0;
        while(n!=0){
            if((n&1)==0)cnt++;
            n>>>=1;
        }
        return  (cnt&1)==0;
    }
     public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}