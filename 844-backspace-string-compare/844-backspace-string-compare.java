class Solution {
    public boolean backspaceCompare(String s, String t) {
        
    String s1=convert(s);
    String t1=convert(t);
       return s1.equals(t1);
    }
    public String convert(String s){
         Stack<Character>st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(st.size()>0){
               char ch1= st.pop();}
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    
}