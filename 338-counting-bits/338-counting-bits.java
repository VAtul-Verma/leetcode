class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2]+i%2;
            //bits shiftng concet
            //if n==odd then the bits are i%2=1  so the total bits =1+bits in previous ans[i/2];
            //if n==even then the i%2==0  so the bits are =bits in previous ans[i/2];
        }
        return ans;
    }
}