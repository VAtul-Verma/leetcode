class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1){
            return 0;
        }
        int mid=(int)Math.pow(2,n-1) /2;      //caculating the length od the string  which is always in 2 ki power
        if(k<=mid){
            return kthGrammar(n-1,k);
        }else{
            return kthGrammar(n-1,k-mid)==1?0:1;
        }
    }
}