// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int [][]dp=new int[N+1][N+1];
        return mcm(arr,0,N-1,dp);
    }
    public static int mcm(int []arr,int si,int ei,int [][]dp){
        if(ei-si==1)return dp[si][ei]=0;
        if(dp[si][ei]!=0)return dp[si][ei];
        int minres=(int )1e9;
        for(int cut=si+1;cut<ei;cut++){
            int leftres=mcm(arr,si,cut,dp);
            int rightres=mcm(arr,cut,ei,dp);
            minres=Math.min(minres,leftres+arr[si]*arr[cut]*arr[ei]+rightres);
        }
        return dp[si][ei]=minres;
    }
}