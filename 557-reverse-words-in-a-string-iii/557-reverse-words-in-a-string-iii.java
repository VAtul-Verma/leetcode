class Solution {
    public String reverseWords(String s) {
        int l=0;
        int r=0;
        
        String ans="";
        while(l<s.length()){
            String str="";
            while(r<s.length() && s.charAt(r)!=' '){
                str=s.charAt(r)+str;
                r++;
            }
            ans+=str+" ";
            l=r+1;
            r=l;
        }
        
        return ans.substring(0,ans.length()-1);
    }
}