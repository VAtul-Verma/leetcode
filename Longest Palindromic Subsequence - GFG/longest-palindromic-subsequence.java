// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n=S.length();
        int dp[][]=new int[n][n];
        
        int ans=helper(S,0,n-1,dp);
        return ans;
        
    }
    public int helper(String s,int i,int j,int[][]dp){
        if(i>=j){
            return dp[i][j]=i==j?1:0;
        }
        if(dp[i][j]!=0)return dp[i][j];
        
        int a=helper(s,i+1,j-1,dp);
        int b=helper(s,i+1,j,dp);
        int c=helper(s,i,j-1,dp);
        if(s.charAt(i)==s.charAt(j)){
            return a+2;
        }else{
            return dp[i][j]=Math.max(b,c);
        }
    }
}