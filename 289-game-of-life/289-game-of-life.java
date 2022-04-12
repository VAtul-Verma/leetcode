class Solution {
    int [][]dir={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};  //8 direction arra
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int [][]res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cnt=0;
                for(int []d:dir){
                    int p=i+d[0];
                    int q=j+d[1];
                    
                    if(p>=0 && p<n && q>=0 && q<m && board[p][q]==1){  //check the boundry of the array
                        cnt++;
                    }
                    
                }
                if(board[i][j]==1){    //Any live cell with two or three live neighbors lives on to the next generation.
                    if(cnt==2 || cnt==3){
                        res[i][j]=1;
                    }
                }else{
                    if(cnt==3){  //Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                        res[i][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){     //copy the res array to current array
            for(int j=0;j<m;j++){
                board[i][j]=res[i][j];
            }
        }
    }
}