// class Solution {
//     char[] ch=new char[]{'a','e','i','o','u'};
//     public int countVowelStrings(int n) {     //recursive code
//         int ans=0;
//         for(char c:ch){
//             ans+=count(n-1,c);
//         }
        
//         return ans;
//     }
    
//     int count(int length,char first){
//         if(length==0){
//             return 1;
//         }
//         int ans=0;
//         for(char c:ch){
//             if(first>=c){
//                 ans+=count(length-1,c);
//             }
//         }
        
//         return ans;
//     }
// }

// class Solution {
//     public int countVowelStrings(int n) {   //using dp   TC=(5N)  SC=(6N)
//         int[][] dp=new int[n+1][6];
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=5;j++){
//                 dp[i][j]=dp[i][j-1]+(i>1?dp[i-1][j]:1);
//             }
//         }
        
//         return dp[n][5];
//     }
// }

class Solution {
    public int countVowelStrings(int n) {      //maths formula   (n+k-1)!/k!.(n-1)!
        return (n+4)*(n+3)*(n+2)*(n+1)/24;
    }
}