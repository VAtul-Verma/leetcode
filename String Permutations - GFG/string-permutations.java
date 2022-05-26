// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
     ArrayList<String>fans=new ArrayList<>();
        HashSet<String>ans=new HashSet<>();
         helper(S,"",ans);
         for(String key:ans){
            
                 fans.add(key);
                
            
         }
       Collections.sort(fans);
         return fans;
    }
    public void helper(String s,String psf,HashSet<String>ans){
        if(s.length()==0){
           
               ans.add(psf);
           
            return;
        }
    for(int i=0;i<s.length();i++){
        helper(s.substring(0,i)+s.substring(i+1),psf+s.charAt(i),ans);
    }
        
        
        
    } 
}
