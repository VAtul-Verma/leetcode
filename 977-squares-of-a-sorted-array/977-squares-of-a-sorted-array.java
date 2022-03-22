class Solution {
    public int[] sortedSquares(int[] A) {
     int n=A.length;
       int s=0;
        int e=n-1;
        int []ans=new int[n];
        int k=n-1;
        while(s<=e){
            if(Math.abs(A[s])<Math.abs(A[e])){
                ans[k]=A[e]*A[e];
                e--;
            }else{
                ans[k]=A[s]*A[s];
                s++;
            }
            k--;
        }
        return ans;
    }
}