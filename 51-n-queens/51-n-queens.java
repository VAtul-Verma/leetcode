class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new  ArrayList<>();
         nqeen(0,n,new boolean[n][n],-1,ans);
        return ans;
    }
    public  void nqeen(int qsf,int tq,boolean[][]chess,int lbno,List<List<String>>ans){
        if(qsf==tq){
             ArrayList<String>sans=new ArrayList<>();
                for(int i=0;i<chess.length;i++){
                    // ArrayList<String>sans=new ArrayList<>();
                    String str="";
                    for(int j=0;j<chess.length;j++){
                        
                        if(chess[i][j]==true){
                            str+="Q";
                        }else{
                            str+=".";
                        }
                    }
                    sans.add(str);
                   
                }
            ans.add(sans);
            return ;
        }
        for(int i=lbno+1;i<chess.length*chess.length;i++){
            int r=i/chess.length;
            int c=i%chess.length;
            if(chess[r][c]==false && isqueensafe(chess,r,c)){
                chess[r][c]=true;
                nqeen(qsf+1,tq,chess,i,ans);
                chess[r][c]=false;
            }
        }
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
