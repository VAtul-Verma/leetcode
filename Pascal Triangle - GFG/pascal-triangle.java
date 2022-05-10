// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        long mod=1000000007;
        n=n-1;
         ArrayList<Long> ans=new ArrayList<>();
        ArrayList<Long> preans=null;
        for(int i=0;i<=n;i++){
           ArrayList<Long> tans=new ArrayList<>();
            for(int j=0;j<=i;j++){
              if(j==0 || j==i){
                  tans.add(1l);
              }else{
                  tans.add((preans.get(j-1)%mod+preans.get(j)%mod)%mod);
              }
            }
            preans=tans;
          //  ans.add(tans);
              
        }
     
        return preans;
    }
}