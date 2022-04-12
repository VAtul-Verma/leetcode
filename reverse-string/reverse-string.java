class Solution {
    public void reverseString(char[] s) {
        helper(0,s,s.length-1);
    }
    public static void helper(int idx,char []s,int n){
        if(s.length==0 || idx>n){
            return ;
        }
       char ch=s[idx];
        s[idx]=s[n];
        s[n]=ch;
        helper(idx+1,s,n-1);
       
        
    }
}