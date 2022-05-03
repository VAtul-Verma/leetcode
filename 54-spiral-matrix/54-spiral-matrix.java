class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer>res=new ArrayList();
        if(matrix.length==0){
            return res;
        }
        int sr=0;
        int er=matrix.length-1;
        int sc=0;
        int ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                res.add(matrix[sr][i]);
            }
            sr+=1;
             for(int i=sr;i<=er;i++){
                res.add(matrix[i][ec]);
            }
            ec-=1;
            if(sr<=er){
             for(int i=ec;i>=sc;i--){
               res.add(matrix[er][i]);
            }
            }
            er-=1;
            if(sc<=ec){
             for(int i=er;i>=sr;i--){
            res.add(matrix[i][sc]);
            }
            }
            sc+=1;
        }
        
        return res;
    }
}