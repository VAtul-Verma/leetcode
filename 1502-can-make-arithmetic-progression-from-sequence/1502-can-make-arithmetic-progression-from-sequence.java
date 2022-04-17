class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int i=0;
        int j=1;
        Arrays.sort(arr);
        int diff=Math.abs(arr[j]-arr[i]);
        while(j<arr.length){
            int currdiff=Math.abs(arr[j]-arr[i]);
            if(currdiff!=diff){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}