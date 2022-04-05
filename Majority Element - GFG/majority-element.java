// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
        // your code here
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
        map.put(val,map.getOrDefault(val,0)+1);
            
        }int mele=-1;
        for(int ket :map.keySet()){
            if(map.get(ket)>nums.length/2){
                mele=ket;
            }
        }
        return mele;
    }
}