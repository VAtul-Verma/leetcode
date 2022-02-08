class Solution {
    public String removeKdigits(String s, int removal) {
        Deque<Character>q=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             while(q.size()>0  && q.getLast()>ch && removal>0 ){
            
                q.removeLast();
                 removal--;
                
            }
            q.addLast(ch);
            
        }
        while(q.size()>0 && removal>0){
            q.removeLast();
            removal--;
        }
        while(q.size()>0 && q.getFirst()=='0'){
            q.removeFirst();
        }
        if(q.size()==0)return "0";
          StringBuilder str=new StringBuilder("");
        while(q.size()>0){
            str.append(q.removeFirst());
        }
        return str.toString();
    }
}