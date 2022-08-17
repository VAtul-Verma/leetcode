class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==0)return 0;
        String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>ans=new HashSet<>();
        //loop on arr
        for(String s:words){
             StringBuilder sans=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
               
                sans.append(arr[ch-'a']);
               
            }
         ans.add(sans.toString());
        }
        
        return ans.size();
       
        
        //return the Size of the Hash set
        
        
        
    }
}