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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        // code here
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1!=ch2){
                return 0;
            }
            l++;
            r--;
        }
        return 1;
    }
};