class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=Integer.MIN_VALUE;
        for(String str:sentences){
            String []arr=str.split(" ");
            ans=Math.max(ans,arr.length);
        }
        return ans;
    }
}