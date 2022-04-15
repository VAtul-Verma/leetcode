class Solution {
    public boolean containsDuplicate(int[] nums) {
HashSet<Integer> inputSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            inputSet.add(nums[i]);
        }
if(inputSet.size()< nums.length){
    return true;
}
return false;
}    
}