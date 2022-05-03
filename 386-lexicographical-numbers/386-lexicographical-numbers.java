class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            lexico(i,n,ans);
        }
        return ans;
    }
    public void lexico(int curr,int n,List<Integer>ans){
        if(curr>n)return;
        ans.add(curr);
        for(int i=0;i<=9;i++){
        lexico(curr*10+i,n,ans);
        }
    }
}