class Solution {
    public int removeElement(int[] nums, int val) {
     HashMap<Integer,Integer>map=new HashMap<>();
        for(int value:nums){
            if(value==val){
                continue;
            }else{
                map.put(value,map.getOrDefault(value,0)+1);
            }
            
        }
        int cnt=0;
        for(int key:map.keySet()){
            
            for(int i=0;i<map.get(key);i++){
                nums[cnt]=key;
                cnt++;
            }
        }
        return cnt;
    }
}