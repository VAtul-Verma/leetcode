class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>>res=new ArrayList<>();
        combination(1,k,n,new ArrayList(),res);
        return res;
    }
    public void   combination(int start,int k,int n,ArrayList<Integer>sans,List<List<Integer>>res){
        if(k<0 || n<0)return ;  //no result found
        if(k==0 && n==0){
            res.add(new ArrayList(sans));  //deep copy
            return ;
        }
        for(int i=start;i<=9;i++){  //check all number
            sans.add(i);             //add in list
            combination(i+1,k-1,n-i,sans,res);
            sans.remove(sans.size()-1);    //bacltrack
        }
        
    }
}