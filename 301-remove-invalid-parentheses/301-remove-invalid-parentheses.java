class Solution {
    HashSet<String>res;
    
    public void helper(String s,String output,int open ,int close,int unbalance){
        if(s.length()==0){
            if(open==0 && close==0 && unbalance==0){
                res.add(output);
            }
            return;
        }
        char ch=s.charAt(0);
        String reminput=s.substring(1);
        if(ch=='('){
            if(open>0){ //delete the open brackets
                helper(reminput,output,open-1,close,unbalance);
            }
            //include the character
            helper(reminput,output+ch,open,close,unbalance+1);
 
            
        }
        else if (ch==')'){
            if(close>0){//delete the close
                                helper(reminput,output,open,close-1,unbalance);

                
            }
            if(unbalance>0){//include the closing brances
                                helper(reminput,output+ch,open,close,unbalance-1);

            }
        }else{
                            helper(reminput,output+ch,open,close,unbalance);

        }
    }
    public List<String> removeInvalidParentheses(String s) {
    int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else if(ch==')'){
                if(open>0)open--;
                else close++;
            }
        }
         res=new HashSet<>();
        helper(s,"",open,close,0);
        List<String>ans=new ArrayList<>();
        for(String str:res){
            ans.add(str);
        }
        return ans;
    }
}