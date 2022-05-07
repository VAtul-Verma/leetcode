class Solution {
    private boolean ispossibletoplacenumsber(char [][]board,int r,int c,int num){
        //check in row to place the number
        for(int i=0;i<9;i++){
            if(board[i][c]-'0'==num)return false ;  //number already present in row
        }
        
         //check in column to place the number
        for(int i=0;i<9;i++){
            if(board[r][i]-'0'==num)return false  ; //number already present in column
        }
            //==========check in 3x3 matrix
         //compress the 9*9 matrix in 3*3 matrix  this r and c are the starting point of every 3*3 matrix
        r=(r/3)*3;   
        c=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[r+i][c+j]-'0'==num)return false ;  //if number is present in 3x3 matrix return false
            }
        }
        return true;
    }
    public boolean sudokusolver(char [][]board,ArrayList<Integer>list,int idx){
        if(idx==list.size()){    //all vacant space are filled in sudoku
            return true;
        }
        int r=list.get(idx)/9   ;//find the row
        int c=list.get(idx)%9 ;  //find the column number
        for(int num=1;num<=9;num++){
            if(ispossibletoplacenumsber(board,r,c,num)){
                board[r][c]=(char)('0'+num);      //fill that number in the sudoku
                if(sudokusolver(board,list,idx+1)){   //call for next vacant place and retur true;
                    return true;
                }
                board[r][c]='.';   //back track
            }
        }
        return false;
    }
    
    public void solveSudoku(char[][] board) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    list.add(i*n+j);
                }
            }
        }
        sudokusolver(board,list,0);
    }
}