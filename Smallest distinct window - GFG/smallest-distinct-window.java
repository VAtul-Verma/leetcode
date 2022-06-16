// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        int n=str.length();
        int cnt=0;
        int []freq=new int[128];
        for(int i=0;i<n;i++){
            if(freq[str.charAt(i)]==0){
                freq[str.charAt(i)]=1;
                cnt++;
            }
        }
        int si=0;
        int ei=0;
        int gsi=0;
        int len=(int)1e9;
        while(ei<n){
            if(   freq[str.charAt(ei++)]-->0)cnt--;
            while(cnt==0){
                if(ei-si<len){
                    len=ei-si;
                    gsi=si;
                }
                if(   freq[str.charAt(si++)]++ ==0)cnt++;
            }
        }
        return len;
    }
}