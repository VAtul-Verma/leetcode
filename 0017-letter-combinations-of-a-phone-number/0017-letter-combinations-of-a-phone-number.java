class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        List<String>ans=new ArrayList<>();
        String []code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letters(digits,0,code,"",ans);
        return ans;
    }
    public void letters(String dig,int idx,String []code,String psf,List<String> ans){
        if(idx==dig.length()){
            ans.add(psf);
            return ;
        }
        int val=dig.charAt(idx)-'0';  //find the digit
        String mystring=code[val];    //find the string from code array
        for(int i=0;i<mystring.length();i++){
            letters(dig,idx+1,code,psf+mystring.charAt(i),ans);
        }
    }
}