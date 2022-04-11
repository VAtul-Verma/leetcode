class Solution {
    public List<List<Integer>> generate(int n) {
        int [][]temp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    temp[i][j]=1;
                }else{
                    temp[i][j]=temp[i-1][j-1]+temp[i-1][j];
                }
                
            }
        }
        
         List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>s=new ArrayList<>();
            for(int j=0;j<=i;j++){
                s.add(temp[i][j]);
            }
            ans.add(s);
        }
        return ans;
    }
}