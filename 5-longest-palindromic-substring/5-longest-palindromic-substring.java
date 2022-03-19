class Solution {
   public String longestPalindrome(String s) {
        String ans=s.substring(0,1);
        
        for(int i=0;i<s.length()-1;i++){
            String tmp=getString(s,i,i);
            if(tmp.length()>ans.length())
                ans=tmp;
            
            tmp=getString(s,i,i+1);
            if(tmp.length()>ans.length())
                ans=tmp;
        }
        return ans;
    }
    
    public String getString(String str, int start, int end){
        while(start>=0 && end <str.length() && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        return str.substring(start+1,end);
    }
}