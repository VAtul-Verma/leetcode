// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int nums[], int len){
        // Code Here
        int ans=0;
        int i=0;
        int r=nums.length-1;
        while(i<r){
        
            //basicall find the lower hight and the find area if current area is greater than previous area update it
            int w=r-i;
            int h=Math.min(nums[i],nums[r]);
            ans=Math.max(ans,h*w);
            if(nums[i]>nums[r]){
                r--;
            }else{
                i++;
            }
        }
        return ans;
        
    }
    
}