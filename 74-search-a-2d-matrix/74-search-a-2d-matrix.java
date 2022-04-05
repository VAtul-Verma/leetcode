class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
    int n=arr.length;
        int m=arr[0].length;
        int l=0;
        int h=n*m-1;
    while(l<=h){
        int mid=l+(h-l)/2;
        if(arr[mid/m][mid%m]==target){
            return true;
        }else if (arr[mid/m][mid%m]<target){   //assume 2d array as 1d array      //row num=mid/m      //col=mid%m
            l=mid+1;
        }else {
            h=mid-1;
        }    }
        return false;
    }
}