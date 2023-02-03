//{ Driver Code Starts
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
                    int n=sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.convert(s,n));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
     String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int k = 2* (numRows -1);
        for(int i=0;i<numRows;i++){
            int index = i ;
            while(index<n){
                str.append(s.charAt(index));
                if(i!=0 && i!=numRows-1){
                    int k1 = k- (2*i);
                    int k2 = index + k1;
                    if(k2<n){
                        str.append(s.charAt(k2));
                    }
                }
                index = index + k;   
            }
        }
        return str.toString();
    }
}