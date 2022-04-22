class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        List<String>ans=new ArrayList<>();
        String []code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        lettterc(digits,0,code,"",ans);
        return ans;
    }
    public int lettterc(String dig,int idx,String []code,String psf,List<String> ans){
        if(idx==dig.length()){
            ans.add(psf);
            return 1;
        }
        int cnt=0;
        int val=dig.charAt(idx)-'0';
        String mycode=code[val];
        for(int i=0;i<mycode.length();i++){
            cnt+=lettterc(dig,idx+1,code,psf+mycode.charAt(i),ans);
        }
        return cnt;
    }
}