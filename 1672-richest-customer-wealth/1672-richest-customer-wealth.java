class Solution {
    public int maximumWealth(int[][] a) {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int cnt=0;
            for(int j=0;j<a[0].length;j++){
                
                cnt+=a[i][j];
            }
            result=Math.max(cnt,result);
        }
        return result;
    }
}