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
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int nums[],int N,int k){
        // code here
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer>ans=new ArrayList<>();
        int minmoney=0;
        for(int i=0,j=n-1;i<=j;i++){
            minmoney+=nums[i];
            j-=k;
        }
        int maxmoney=0;
         for(int i=n-1,j=0;i>=j;i--){
            maxmoney+=nums[i];
            j+=k;
        }
        ans.add(minmoney);
        ans.add(maxmoney);
        return ans;
    }
}