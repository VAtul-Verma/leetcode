class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        int row=image.length;
        int col=image[0].length;
        int src=image[sr][sc];
        dfs(image,sr,sc,newColor,row,col,src);
        return image;
        
    }
    public void dfs(int[][] image, int sr, int sc, int newColor,int rows,int column,int source  ){
        if(sr<0 || sr>=rows || sc<0 ||sc>=column){
            return ;
        }
        else if(image[sr][sc]!=source){
            return;
            
        }
        image[sr][sc]=newColor;
        dfs(image ,sr-1,sc,newColor,rows,column,source);
         dfs(image ,sr+1,sc,newColor,rows,column,source);
         dfs(image ,sr,sc-1,newColor,rows,column,source);
         dfs(image ,sr,sc+1,newColor,rows,column,source);
    }
}