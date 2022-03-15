class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:answers){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            int onegroup_size=key+1;
            int freq=map.get(key);
            int totalonetypegroup=(int)Math.ceil(freq*1.0/onegroup_size*1.0);
            ans+=totalonetypegroup*onegroup_size;
        }
        return ans;
    }
}