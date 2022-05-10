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
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    
     public long countFriendsPairings(int n){ 
       //code here
       long []dp=new long[n+1];
       return countFriendsPairingshelper(n,dp);
    }
    public long countFriendsPairingshelper(int n,long []dp){ 
       //code here
       long m=1000000007;
       for(int i=0;i<=n;i++){
       if(i<=1){
           dp[i]=1; 
           continue;
       } 
      
       
       long single=dp[i-1]%m;
       long pair=(dp[i-2]%m*(i-1)%m)%m;
        dp[i]=single+pair;
       }
       return dp[n]%m;
    }
}    
 