class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int c=1;
        for(int i=0;i<n;i++){
            ArrayList<Integer>sans=new ArrayList<>();
            sans.add(c);
            for(int j=1;j<=i;j++){
                c=c*(i-j+1)/j;
                sans.add(c);
            }
            ans.add(sans);
        }
        return ans;
    }
}