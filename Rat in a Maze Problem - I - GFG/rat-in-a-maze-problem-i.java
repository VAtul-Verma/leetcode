// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        if(n==0 || m[0][0]==0 || m[n-1][n-1]==0) return new ArrayList<>();
        int [][] dir={{1,0},{0,-1},{0,1},{-1,0}};
        String []dirs={"D","L","R","U"};
        ArrayList<String>res=new ArrayList<>();
        floodfill(0,0,n-1,n-1,m,dir,dirs,"",res);
        return res;
        
    }
    public static int floodfill(int sr,int sc,int er,int ec,int[][] vis,int [][]dir,String []dirs,String ans,ArrayList<String>res){
        if(sc==ec && sr==er){
            res.add(ans);
            return 1;
        }
        vis[sr][sc]=0;
        int cnt=0;
        for(int d=0;d<4;d++){
            int r=sr+dir[d][0];
            int c=sc+dir[d][1];
            if(r>=0 && c>=0 && r<=er && c<=ec && vis[r][c]==1){
                cnt+=floodfill(r,c,er,ec,vis,dir,dirs,ans+dirs[d],res);
            }
        }
        vis[sr][sc]=1;
        return cnt;
        
    }
}