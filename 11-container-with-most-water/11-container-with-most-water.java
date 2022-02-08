class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while(left<=right){
           int area=Math.min(arr[left],arr[right])*(right-left);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
            if(area>maxarea){
                maxarea=area;
            }
        }
        return maxarea;
    }
}