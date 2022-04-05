class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i=m;i<m+n;i++){
          nums1[i]=nums2[i-m];
      }
        for(int g=(m+n+1)/2;g>=1;g/=2){
            for(int i=0,j=g;j<m+n;j++,i++){
                if(nums1[i]>nums1[j]){
                    swap(nums1,i,j);
                }
            }
        }
         for(int i=0,j=1;j<m+n;j++,i++){       //handle for gap 1
                if(nums1[i]>nums1[j]){    
                    swap(nums1,i,j);
                }
            }
    }
    public static void swap(int []nums1,int i,int j){
        int temp=nums1[i];
        nums1[i]=nums1[j];
        nums1[j]=temp;
    }
}