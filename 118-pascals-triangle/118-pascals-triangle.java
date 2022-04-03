class Solution {
    public List<List<Integer>> generate(int n) {
    
         List<List<Integer>> ans =new ArrayList<>();
     int [][]a=new int[n][n];
    for(int i=0;i<n;i++){
        
        for(int j=0;j<=i;j++){
            if(i==j || j==0){
                a[i][j]=1;
            }else{
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
    }
        for(int i=0;i<n;i++){
            ArrayList<Integer>sans=new ArrayList<>();
            for(int j=0;j<=i;j++){
                sans.add(a[i][j]);
            }
            ans.add(sans);
        }
        return ans;
    }
}