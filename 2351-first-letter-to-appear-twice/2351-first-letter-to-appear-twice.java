class Solution {
    public char repeatedCharacter(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,i);
           }
       }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=i){
                return s.charAt(i);
            }
        }
        return '\0';
    }
}