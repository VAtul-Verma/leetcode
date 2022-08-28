class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int col=0;col<n;col++){
            sort(mat,0,col,m,n);
        }
        for(int row=1;row<m;row++){
            sort(mat,row,0,m,n);
        }
        return mat;
        
    }
    public void sort(int [][]mat,int row,int col,int m,int n){
        int r=row;
        int c=col;
        List<Integer>ans=new ArrayList<Integer>();
        while(r<m && c<n){
            ans.add(mat[r][c]);
            r++;
            c++;
    }
    Collections.sort(ans);
    r=row;
        c=col;
        int index =0;
          while(r<m && c<n){
            mat[r][c]=ans.get(index++);
            r++;
            c++;
    }
        
}}