class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n=mat.length;
        int []arr=new int[n*n];
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[s++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}