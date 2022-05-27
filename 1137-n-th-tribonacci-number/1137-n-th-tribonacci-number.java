class Solution {
    public int tribonacci(int N,int []dp) {
        for(int n=0;n<=N;n++){
        if(n<=1){ dp[n]=n;
           continue;     }
        if(n==2){ dp[n]=1;
          continue;        }
     
        dp[n]= dp[n-1]+dp[n-2]+dp[n-3];
        }
        return dp[N];
    }
    public int tribonacci(int n){
        int []dp=new int[n+1];
        return tribonacci(n,dp);
    }
}