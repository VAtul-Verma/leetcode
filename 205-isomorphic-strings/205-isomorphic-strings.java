class Solution {
    public boolean isIsomorphic(String str1, String str2) {
          // Your code here
        if(str1.length()!=str2.length()){
            return false;
            
        }
        HashMap<Character,Character>map1=new HashMap<>();
        HashSet<Character>map2=new HashSet<>();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }else{
                if(map2.contains(ch2)){
                    return false;
                }else{
                    map1.put(ch1,ch2);
                    map2.add(ch2);
                }
            }  
        }
        return true;
    }
}