class Solution {
    public int minInsertions(String s) {
        int open=0;
        int addition=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else if(ch==')'){
                if(open>0)open--;
                else addition++;   //add ( braces to balance the closing ) braces
                
                 if(i+1<s.length() && s.charAt(i+1)==')')    // ) ke baad bhi ) aayega to hi balance hoga
                i++;  //loop id ko 2 step aage karna
            else{
                addition++;   // ) braces ko bhi add karna balnce karne ke liye
            }
            }
          
        }
        return addition + 2*open;
    }
}