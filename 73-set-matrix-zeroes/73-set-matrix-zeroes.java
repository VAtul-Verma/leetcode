class Solution {
    public void setZeroes(int[][] m) {
    int []row=new int[m.length];
        int []col=new int[m[0].length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]==1){
                for(int k=0;k<m[0].length;k++){
                    m[i][k]=0;
                }
            }
        }
         for(int i=0;i<col.length;i++){
            if(col[i]==1){
                for(int k=0;k<m.length;k++){
                    m[k][i]=0;
                }
            }
        }
    }
}