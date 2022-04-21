class Solution {
    public String interpret(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G'){
                st.append("G");
            }else if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    st.append("o");
                }else st.append("al");
            }
        }
        return st.toString();
    }
}