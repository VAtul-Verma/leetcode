class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),result);
        return result;
    }
    
    public void backtrack(int []cand,int start,int target,List<Integer>list,List<List<Integer>>ans){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(list));
        }
        
        for(int i=start;i<cand.length;i++){
            list.add(cand[i]);
            backtrack(cand,i,target-cand[i],list,ans);
            list.remove(list.size()-1);
        }
    }
}