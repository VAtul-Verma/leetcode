class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int mdis=0;
        for(int i=0;i<nums1.length;i++){
            int l=i;int r=nums2.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(i<=mid && nums1[i]<=nums2[mid]){
                    int distance=mid-i;
                 mdis=Math.max(mdis,distance);
                    l=mid+1;
                
                }else if (nums1[i]>nums2[mid]){
                    r=mid-1;
                }
            }
        }
        return  mdis;
    }
}