class Solution {
    public int maxProduct(String[] words) {
        int ans=0;
        if(words.length==0)return 0;
        if(words.length==1)return words[0].length();
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++)
            if(length(words[i],words[j])){
                ans=Math.max(ans,words[i].length()*words[j].length());
            }
            
        }
        return ans;
    }
    public boolean length(String s1,String s2){
        HashSet<Character>set=new HashSet<>();
        for(Character ch:s1.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        for(Character ch:s2.toCharArray()){
            if(set.contains(ch))return false;
        }
        return true;
    }
}