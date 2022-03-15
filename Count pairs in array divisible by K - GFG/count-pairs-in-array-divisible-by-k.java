// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int countKdivPairs(int arr[], int n, int k)
    {
        //code here
        //code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:arr){
            map.put(val%k,map.getOrDefault(val%k,0)+1);
        }
        int cnt=0;
        if(map.containsKey(0)){
            cnt+=(map.get(0)*(map.get(0)-1))/2;   //reminder 0 case 
        }
        for(int i=0;i<=(k-1)/2;i++){
            if(map.containsKey(i) && map.containsKey(k-i)){
                cnt+=map.get(i)*map.get(k-i);    
            }
        }
        if(k%2==0){
            if(map.containsKey(k/2)){  //if k is even 
                cnt+=(map.get(k/2)*(map.get(k/2)-1))/2;
            }
        }
        return cnt;
    }
}