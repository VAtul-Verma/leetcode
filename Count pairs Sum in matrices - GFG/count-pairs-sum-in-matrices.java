// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int num1[][], int num2[][], int n, int x ) {
        // code here
        int size=num1.length*num1[0].length;
        int l=0;
        int r=size-1;
        int ans=0;
        while(l<size &&r>=0){
            int r1=l/num1.length;
             int c1=l%num1.length;
             
              int r2=r/num2.length;
               int c2=r%num2.length;
               int sum=num1[r1][c1]+num2[r2][c2];
               if(sum==x){
                   ++ans;
                   l++;
                   r--;
               }else if(sum>x){
                   r--;
               }else{
                   l++;
               }
        }
        	return ans;
	  
	}

    
}