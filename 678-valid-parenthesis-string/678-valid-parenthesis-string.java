class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>open=new Stack<>();
        Stack<Integer>star=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open.push(i);
            }else if(ch=='*'){
                star.push(i);
            }else{
                if(open.size()>0)open.pop();
                else if(star.size()>0){
                    star.pop();
                }
                else return false;
            }
        }
        if(open.size()>star.size())return false;
        while(open.size()>0){
            int openidx=open.pop();
            int closeidx=star.pop();
            if(openidx>closeidx)return false;
        }
        return true;
    }
}