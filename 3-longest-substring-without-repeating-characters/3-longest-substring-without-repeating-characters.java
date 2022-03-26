class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer>bucket =new HashMap<>();
        int maxlen=0;
        int st=0;
        for(int e=0;e<s.length();e++){
            if(bucket.containsKey(s.charAt(e))){
                st=Math.max(st,bucket.get(s.charAt(e))+1);
            }
            bucket.put(s.charAt(e),e);
            maxlen=Math.max(maxlen,e-st+1);
        }
        return maxlen; 
    }
}