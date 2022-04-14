class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet();
        HashSet<Integer>set1=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int val:nums2){
            set1.add(val);
        }
        ArrayList<Integer>alist=new ArrayList<>();
        for(int i:set1){
            if(!set.contains(i)){
                alist.add(i);
            }
        }
         ArrayList<Integer>blist=new ArrayList<>();
        for(int i:set){
            if(!set1.contains(i)){
                blist.add(i);
            }
        }
        ans.add(blist);
        ans.add(alist);
        return ans;
    }
}