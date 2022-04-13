class Solution {
    public int[][] generateMatrix(int n) {
      int cnt=0;
        int srow=0;
        int scol=0;
        int erow=n-1;
        int ecol=n-1;
        int [][]ans=new int[n][n];
        int max=n*n;
            
            
            
     while(true){

            for(int i=scol;i<=ecol;i++){
                cnt++;
                ans[srow][i]=cnt;
               
                if(cnt==max){
                    return ans;
                }
            }
            srow++;
            
            for(int i=srow;i<=erow;i++){
                 cnt++;
                ans[i][ecol]=cnt;
                
                
                if(cnt==max){
                    return ans;
                }
            }
            ecol--;
            
            for(int i=ecol;i>=scol;i--){
                 cnt++;
                ans[erow][i]= cnt;
                
                if(cnt==max){
                    return ans;
                }
            }
            erow--;
            
            for(int i=erow;i>=srow;i--){
                 cnt++;
                ans[i][scol]=cnt;
                
                if(cnt==max){
                    return ans ;
                }
            }
            scol++;
        
    }

}
    
}