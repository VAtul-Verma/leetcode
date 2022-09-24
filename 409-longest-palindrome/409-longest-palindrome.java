class Solution {
    public int longestPalindrome(String s) {
        int len=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                len+=2;
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if(set.size()>0){
            len++;
        }
        return len;
    }
}