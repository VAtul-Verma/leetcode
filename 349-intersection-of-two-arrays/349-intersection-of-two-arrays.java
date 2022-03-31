class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       HashSet<Integer>set=new HashSet<>();
       int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
               // System.out.println(nums1[i]);
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int []ans=new int[set.size()];
        int cnt=0;
        for(int k:set){
            System.out.println(k);
            ans[cnt++]=k;
        }
        
        return ans;
    }
}