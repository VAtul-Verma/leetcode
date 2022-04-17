class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer>insec=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int val:nums2){
            if(map.containsKey(val) && map.get(val)>0){
                map.put(val,map.get(val)-1);
                insec.add(val);
            }
        }
        int []ans=new int[insec.size()];
        int k=0;
        for(int i:insec){
            ans[k++]=i;
        }
        return ans;
    }
}