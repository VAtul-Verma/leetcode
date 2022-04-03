// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        // code here 
         ArrayList<Integer>ans=new ArrayList<>();
        int total=r*c;
        int cnt=0;
        int srow=0;
        int scol=0;
        int erow=r-1;
        int ecol=c-1;
        while(cnt<total){
            for(int i=scol;i<=ecol;i++){
                if(cnt>=total){
                    return ans;
                }
                ans.add(arr[srow][i]);
                cnt++;
                
            }
            srow++;
             for(int i=srow;i<=erow;i++){
                  if(cnt>=total){
                    return ans;
                }
                ans.add(arr[i][ecol]);
                cnt++;
               
            }
            ecol--;
             for(int i=ecol;i>=scol;i--){
                 if(cnt>=total){
                    return ans;
                }
                ans.add(arr[erow][i]);
                cnt++;
                
            }
            erow--;
             for(int i=erow;i>=srow;i--){
                 if(cnt>=total){
                    return ans;
                }
                ans.add(arr[i][scol]);
                cnt++;
               
            }
            scol++;
            
        }
        return ans;
    }
}
