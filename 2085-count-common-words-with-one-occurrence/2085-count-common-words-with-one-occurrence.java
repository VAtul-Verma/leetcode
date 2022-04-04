class Solution {
    public int countWords(String[] words1, String[] words2) {
        if(words1.length==0 || words2.length==0){
            return 0;
        }
        int ans=0;
        HashMap<String ,Integer>map=new HashMap<>();
        for(String s: words1){
            map.put(s,map.getOrDefault(s,0)+1);
            
        }
         HashMap<String ,Integer>map2=new HashMap<>();
         for(String s: words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
            
        }
        for(String s:words1){
            if(map.containsKey(s) && map2.containsKey(s))
            if(map.get(s)==1  && map2.get(s)==1){
                ans++;
            }
        }
        return ans;
    }
}