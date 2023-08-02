class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>(); 
        List<Integer>smallans=new ArrayList<>();
        permuteh(nums,0,ans,smallans);
        return ans;
    }
     public int permuteh(int[] nums,int elementused,List<List<Integer>>ans,List<Integer>smallans) {
        if(elementused==nums.length){
            List<Integer>base=new ArrayList<>(smallans);  //deep copy
            ans.add(base);
            return 1;
        }
         int cnt=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]>-11){
                 int val=nums[i];
                 smallans.add(val);
                 nums[i]=-11;
                 cnt+=permuteh(nums,elementused+1,ans,smallans);
                 nums[i]=val;
                 smallans.remove(smallans.size()-1);
             }
         }
         return cnt;
    }
}