class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st=new Stack();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);   //push the index of that
            }else{
                if(st.size()>0 && s.charAt(st.peek())=='('){
                    st.pop();    //means that we found a balanced pair
                }else{
                    st.push(i);  //push closing bracket in the stack
                }
                
            }
            int j=st.size()==0?-1:st.peek();
            max=Math.max(max,i-j);
        }
        return max;
    }
}