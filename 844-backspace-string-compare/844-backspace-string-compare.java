class Solution {
    public boolean backspaceCompare(String s, String t) {
       String st=convert(s);
        String st1=convert(t);
        return st.equals(st1);
       
    }
    public static String convert(String s){
          Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(st.size()>0){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.empty()){
            str.append(st.pop());
        }
        return str.toString();
    }
}