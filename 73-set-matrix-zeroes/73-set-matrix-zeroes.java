class Solution {
    public void setZeroes(int[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    for(int k=0;k<a[0].length;k++){
                        if(a[i][k]!=0){
                            a[i][k]=Integer.MIN_VALUE+1;
                        }
                    }
                    for(int k=0;k<a.length;k++){
                         if(a[k][j]!=0){
                            a[k][j]=Integer.MIN_VALUE+1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==Integer.MIN_VALUE+1){
                    a[i][j]=0;
                }
            }
        }
    }
}