// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[])
    {
        // code here
 int n=nums.length;
        int []dp=new int[n];
        int maxlen=0;
        for(int i=0;i<n;i++){
            maxlen=Math.max(maxlen,helper(nums,i,dp));
        }
        return maxlen;
    }
    public static int helper(int []arr,int i,int []dp){
        if(dp[i]!=0){
            return dp[i];
        }
        int maxlen=1; ///same index start and end on same index
        for(int j=i-1;j>=0;j--){
            if(arr[j]<arr[i]){
                int recans=helper(arr,j,dp);
                maxlen=Math.max(recans+1,maxlen);
            }
        }
        return dp[i]=maxlen;
    }
} 