// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

//Back-end complete function Template for Java

class Solution{
    
    public static int count4Divisibiles(int arr[], int n ) 
    { 
        // Complete the function
         //code here
         int k=4;
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


// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.count4Divisibiles(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


  // } Driver Code Ends