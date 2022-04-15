class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> preans=null;
        for(int i=0;i<=n;i++){
           List<Integer> tans=new ArrayList<>();
            for(int j=0;j<=i;j++){
              if(j==0 || j==i){
                  tans.add(1);
              }else{
                  tans.add(preans.get(j-1)+preans.get(j));
              }
            }
            preans=tans;
          //  ans.add(tans);
              
        }
     
        return preans;
    }
}