class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
        map.put(val,map.getOrDefault(val,0)+1);
            
        }int mele=Integer.MIN_VALUE;
        for(int ket :map.keySet()){
            if(map.get(ket)>nums.length/2){
                mele=ket;
            }
        }
        return mele;
    }
}