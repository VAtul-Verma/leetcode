class Solution {
    private class Pair{
            int x;
            int y;
            Pair(int x,int y){
                this.x=x;
                this.y=y;
            }
        }
    public int[][] updateMatrix(int[][] mat) {
       LinkedList<Pair>queue=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    queue.addLast(new Pair(i,j));
                }else if(mat[i][j]==1){
                    mat[i][j]=-1;
                }
            }
        }
    while(queue.size()>0){
        Pair rem=queue.removeFirst();
        for(int i=0;i<dir.length;i++){
            int rowdesh=rem.x+dir[i][0];
            int cldesh=rem.y+dir[i][1];
            if(rowdesh>=0 && cldesh>=0 && rowdesh<mat.length  && cldesh<mat[0].length && mat[rowdesh][cldesh]<0){
                mat[rowdesh][cldesh]=mat[rem.x][rem.y]+1;
                queue.addLast(new Pair(rowdesh,cldesh));
            }
        }
    }
        return mat;
    }
    private static int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
}