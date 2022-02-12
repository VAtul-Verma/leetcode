class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int []cnt=new int[26];
        for(char c:s1.toCharArray()){
            cnt[c-'a']++;
        }
        int start=0;
        for(int i=0;i<s1.length();++i){
            cnt[s2.charAt(i)-'a']--;
        }
        boolean match=true;
        for(int c:cnt){
            if(c!=0){
                match=false;
                break;
            }
        }
        if(match)return true;
        start++;
        while(start<=s2.length()-s1.length()){
            int id1=s2.charAt(start-1)-'a';
            int id2=s2.charAt(start+s1.length()-1)-'a';
            cnt[id1]++;
            cnt[id2]--;
           
        
       match=true;
        for(int c:cnt){
            if(c!=0){
                match=false;
                break;
            }
        }
        if(match)return true;
        start++;
        }
        return false;
    }
}