// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] nums, int n) {
        // code here
        long max_overall=nums[0];
        long max_ending=nums[0];
        long min_ending=nums[0];
        for(int i=1;i<n;i++){
            long temp=max_ending;
            max_ending=Math.max(nums[i],Math.max(max_ending*nums[i],min_ending*nums[i]));
             min_ending=Math.min(nums[i],Math.min(temp*nums[i],min_ending*nums[i]));
            max_overall=Math.max(max_overall,max_ending);
        }
        return max_overall;
    }
}