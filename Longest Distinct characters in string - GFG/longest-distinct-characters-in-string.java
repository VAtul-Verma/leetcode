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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
         HashMap<Character,Integer>bucket =new HashMap<>();
        int maxlen=0;
        int st=0;
        for(int e=0;e<s.length();e++){
            if(bucket.containsKey(s.charAt(e))){
                st=Math.max(st,bucket.get(s.charAt(e))+1);
            }
            bucket.put(s.charAt(e),e);
            maxlen=Math.max(maxlen,e-st+1);
        }
        return maxlen;
        
    }
}