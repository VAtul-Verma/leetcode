class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][][]dp=new int[m+1][n+1][strs.length+1];
        return helper(strs,m,n,0,dp);
    }
    public int helper(String[] strs,int zero,int one,int index,int [][][]dp){
         if(index==strs.length || zero + one == 0){
            return 0;
        }
        
        if(dp[zero][one][index]>0){
            return dp[zero][one][index];
        }
        
        int[] count = count(strs[index]);
        
        //consider changes the zero ad one
        int consider=0;
        
        if(zero >=count[0] && one>=count[1]){
            consider = 1 + helper(strs,zero-count[0],one-count[1],index+1,dp);
        }
        
        int skip = helper(strs,zero,one,index+1,dp);
        
        //skip
        dp[zero][one][index]=Math.max(consider,skip);;
        return dp[zero][one][index];
    }
    public int [] count(String s){
        int []cnt=new int[2];
        for(char c:s.toCharArray()){
            cnt[c-'0']++;
        }
        return cnt;
    }
}