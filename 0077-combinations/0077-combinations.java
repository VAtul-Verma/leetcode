class Solution {
     public void combine(List<List<Integer>>combinations,List<Integer>combination,int currbox,int n, int k) {
        if(currbox==n){
            if(combination.size()==k){
                List<Integer> temp=new ArrayList<>(combination);
                combinations.add(temp);
            }
            return;
        }
    
    //yes call
    combination.add(currbox+1);
    combine(combinations,combination,currbox+1,n,k);
    combination.remove(combination.size()-1);
    
    //no element taken
        combine(combinations,combination,currbox+1,n,k);
}
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>combinations=new ArrayList<>();
        List<Integer>combination=new ArrayList<>();
        combine(combinations,combination,0,n,k);
        return combinations;
    }
}