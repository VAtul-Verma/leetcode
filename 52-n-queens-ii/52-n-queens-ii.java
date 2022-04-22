class Solution {
    public int totalNQueens(int n) {
        return nqeen(0,n,new boolean[n][n],-1);
    }
     public  int nqeen(int qsf,int tq,boolean[][]chess,int lbno){
        if(qsf==tq){
             
            return 1 ;
        }
         int cnt=0;
        for(int i=lbno+1;i<chess.length*chess.length;i++){
            int r=i/chess.length;
            int c=i%chess.length;
            if(chess[r][c]==false && isqueensafe(chess,r,c)){
                chess[r][c]=true;
               cnt+= nqeen(qsf+1,tq,chess,i);
                chess[r][c]=false;
            }
        }
         return cnt;
    }
        private boolean isqueensafe(boolean [][]chess,int row,int col){
            for(int i=row,j=col-1;j>=0;j--){
                if(chess[i][j]){   //horizontal check
                    return false;
                }
            }
             for(int i=row-1,j=col;i>=0;i--){
                if(chess[i][j]){   //vertical check
                    return false;
                }
            }
             for(int i=row-1,j=col-1;j>=0 && i>=0;i--,j--){
                if(chess[i][j]){   //digonal left check
                    return false;
                }
            }
             for(int i=row-1,j=col+1; i>=0 && j<chess.length ;i--,j++){
                if(chess[i][j]){   //digonal left check
                    return false;
                }
            }
            return true;
}
}