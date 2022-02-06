class Solution {
    int idx=0;
    public String decodeString(String s) {
        StringBuilder res=new StringBuilder("");
        int cnt=0;
        while(idx<s.length() && s.charAt(idx)!=']'){
            char ch=s.charAt(idx);
            idx++;
            if(ch>='0' && ch<='9'){
                cnt=cnt*10+(ch-'0');
            }else if(ch=='['){
                String chotans=decodeString(s);
                for(int i=0;i<cnt;i++){
                    res.append(chotans);
                }
                cnt=0;
            }else{
                res.append(ch);
            }
        }
        if(idx<s.length())idx++;
        return res.toString();
    }
}