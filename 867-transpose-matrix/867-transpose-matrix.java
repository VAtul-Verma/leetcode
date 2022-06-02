class Solution {
    public int[][] transpose(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [][]res=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               res[i][j]=mat[j][i];
            }
        }
        return res;
    }
}