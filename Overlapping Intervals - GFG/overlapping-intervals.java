// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
         Arrays.sort(Intervals,(a,b)->a[0]-b[0])  ;              //sorting the based on starting index
        ArrayList<int []>merged=new ArrayList<>();             //making the merged arraylist
        merged.add(Intervals[0]);                     //put first element in merged array list
        for(int i=0;i<Intervals.length;i++){
            int [] lastidx=merged.get(merged.size()-1) ;     //fint the last element in arraylist
            int [] currdx=Intervals[i];                     //element of intrevals array
            if(lastidx[1]>=currdx[0]){     //if the end idx of arraylist element is greater then the starting idx of intrevals array then merged them
                lastidx[1]=Math.max(lastidx[1],currdx[1]);
                
                
            }   else{
                merged.add(currdx);
            }         
        }
        int [][]res=new int[merged.size()][2];
        for(int i=0;i<merged.size();i++){
            res[i]=merged.get(i);
        }
        return res;
    }
}