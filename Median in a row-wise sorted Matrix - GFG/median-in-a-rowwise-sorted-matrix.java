// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int countlessorequalto(int []arr,int mid){
        int l=0;
        int high=arr.length-1;
        while(l<=high){
            int mi=l+(high-l)/2;
            if(arr[mi]<=mid)l=mi+1;
            else high=mi-1;
        }
        return l;
    }
    int median(int arr[][], int r, int c) {
       int low=1;
       int high=2000;
       while(low<=high){
           int mid=low+(high-low)/2;
           int cnt=0;
           for(int i=0;i<r;i++){
               cnt+=countlessorequalto(arr[i],mid);
           }
           if(cnt<=(r*c)/2)low=mid+1;
           else high=mid-1;
       }
       return low;
    }
}