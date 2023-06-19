class Solution {
    public int largestAltitude(int[] gain) {
        int ans =0;
        int currgain=0;
        for(int i=0;i<gain.length;i++){
           currgain+=gain[i];
            ans =Math.max(ans,currgain);
        }
        return ans;
    }
    
}