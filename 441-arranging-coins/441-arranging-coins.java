class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int temp=n;
        int cnt=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            if(n<=temp){
                cnt++;
            }
        }
        return cnt;
    }
}