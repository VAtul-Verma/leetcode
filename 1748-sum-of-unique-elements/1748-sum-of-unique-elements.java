class Solution {
    public int sumOfUnique(int[] a) {
    HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:a){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
                ans+=key;
            }
        }
        return ans;
    }
}