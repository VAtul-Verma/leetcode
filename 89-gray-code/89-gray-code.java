class Solution {
    public List<Integer> grayCode(int n) {
        if(n==1){
            List<Integer>base=new ArrayList<>();
            base.add(0);
            base.add(1);
            return base;
        }
        List<Integer>sres=grayCode(n-1);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<sres.size();i++){
            int val=sres.get(i);
            ans.add(val);
        }
         for(int i=sres.size()-1;i>=0;i--){
            int val=sres.get(i);
            int bm=1<<(n-1);
             val=val|bm;
             ans.add(val);
        }
        return ans;
    }
}