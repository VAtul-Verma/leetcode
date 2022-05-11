// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int [][]dir={ {0,1},{1,1},{-1,1}   };
        int [][]dp =new int[n][m];
        for(int []d:dp)Arrays.fill(d,-1);
        int maxcoin=0;
        for(int r=0;r<n;r++){
            maxcoin=Math.max(maxcoin,helper(r,0,n-1,m-1,M,dir,dp));
        }
        return maxcoin;
    }
    static int helper(int sr,int sc,int er,int ec,int arr[][],int [][]dir,int [][]dp){
        if(sc==ec){
            return dp[sr][sc]=arr[sr][sc];
        }
        if(dp[sr][sc]!=-1)return dp[sr][sc];
        int maxcoin=0;
        for(int d=0;d<dir.length;d++){
            int r=sr+dir[d][0];
            int c=sc+dir[d][1];
            if(r>=0 && c>=0 && r<arr.length && c<arr[0].length){
               maxcoin=Math.max(maxcoin,helper(r,c,er,ec,arr,dir,dp)+arr[sr][sc]); 
            }
        }
        return dp[sr][sc]=maxcoin;
    }
}