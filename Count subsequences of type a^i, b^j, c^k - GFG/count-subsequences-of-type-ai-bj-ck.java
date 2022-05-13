// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fun(String s)
    {
        // Write your code here
        int m=1000000007;
        int acnt=0,bcnt=0,ccnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                acnt= (1+2*acnt%m)%m  ;  // we can write this is long form==>(acnt%m+(1+acnt%m)%m)%m;
            }else if(ch=='b'){
                bcnt=(acnt%m+2*bcnt%m)%m; // we can write this is long form==>(bcnt%m+(acnt%m+bcnt%m)%m)%m;
            }else if(ch=='c'){
                  ccnt=(bcnt%m+2*ccnt%m)%m;    // we can write this is long form==>(ccnt%m+(bcnt%m+ccnt%m))%m;
            }
        }
        return (ccnt%m);
    }
}