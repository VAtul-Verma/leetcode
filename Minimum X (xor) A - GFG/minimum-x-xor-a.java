//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int c1=setbit(a);
        int c2=setbit(b);
        if(c1==c2){
            return a  ;// if the setbit are equal the retur the a
        }else if(c1>c2){
            //when a has more set bits then
            int diff=c1-c2;
            while(diff>0){
                a=a&(a-1);
                diff--;
            }
            return a;
        }else{
            //when b have more setbits;
             int diff=c2-c1;
            while(diff>0){
                a=(a |(a+1));
                diff--;
            }
            return a;
        }
    }
    public static int setbit(int b){
       
        int cnt=0;
        while(b>0){
            if((b%2)==1){
                cnt++;
              
            }
              b>>=1;
        }
        return cnt;
    }
}