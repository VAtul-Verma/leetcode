class Solution {
    public int [][]minchange(String s){
        int n=s.length();
        int [][]dp=new int[n+1][n+1];
        for(int gap=1;gap<n;gap++){
            for(int i=0,j=gap;j<n;j++,i++){
                if(gap==1)dp[i][j]=s.charAt(i)==s.charAt(j)?0:1;
                else dp[i][j]=s.charAt(i)==s.charAt(j)?dp[i+1][j-1]:dp[i+1][j-1]+1;
            }
        }
        return dp;
    }
    public int palindrome(String s,int k,int si,int [][]dp,int [][]minchange){
        if(s.length()-si<=k || k==0){
            return dp[si][k]=s.length()-si==k?0:(int)1e9;
        }
        if(dp[si][k]!=-1)return dp[si][k];
        int minans=(int )1e9;
        for(int i=si;i<s.length();i++){
            int mincnagemystr=minchange[si][i];
            int minchangerecstr=palindrome(s,k-1,i+1,dp,minchange);
            if(minchangerecstr!=(int)1e9){
                minans=Math.min(minans,minchangerecstr+mincnagemystr);
            }
        }
        return dp[si][k]=minans;
    }
    public int palindromePartition(String s, int k) {
        int n=s.length();
        int dp[][]=new int[n+1][k+1];
        int  [][]mincnahge=minchange(s);
        for(int []d:dp){
            Arrays.fill(d,-1);
            
        }
        return palindrome(s,k,0,dp,mincnahge);
    }
}