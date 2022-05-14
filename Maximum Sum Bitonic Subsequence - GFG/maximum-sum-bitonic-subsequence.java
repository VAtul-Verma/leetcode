// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.maxSumBS(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java



class Compute {
    public int LIS(int []nums,int []dp){
        int maxsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            dp[i]=nums[i];
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+nums[i]);
                }
            }
            maxsum=Math.max(maxsum,dp[i]);
        }
        return maxsum;
    }
    public int LDS(int []nums,int []dp){
        int maxsum=0;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            dp[i]=nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+nums[i]);
                }
            }
            maxsum=Math.max(maxsum,dp[i]);
        }
        return maxsum;
    }
    public  int maxSumBS(int nums[], int n)
    { int []lisdp=new int[nums.length];
        int []ldsdp=new int[nums.length];
        LIS(nums,lisdp);
        LDS(nums,ldsdp);
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            maxsum=Math.max(maxsum,lisdp[i]+ldsdp[i]-nums[i]);
        }
        return maxsum;
        
    }
}