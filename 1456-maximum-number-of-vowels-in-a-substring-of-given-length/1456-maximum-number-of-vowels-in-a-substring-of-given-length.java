class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int si=0;
        int ei=0;
        int vowelcnt=0;
        int maxvowelcnt=0;
        while(ei<n){
            if(isvowel(s.charAt(ei++)))vowelcnt++;
            if(ei-si==k){
                maxvowelcnt=Math.max(maxvowelcnt,vowelcnt);
                if(maxvowelcnt==k)break;
                if(isvowel(s.charAt(si++)))vowelcnt--;
            }
        }
        return maxvowelcnt;
    }
    public static boolean isvowel(Character c){
        if(c=='a' || c=='i'|| c=='o'|| c=='e' || c=='u')return true;
        return false;
    }
    
}