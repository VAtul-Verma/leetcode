class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(int)Math.sqrt(c);
        while(left<=right){
            long sqr=left*left+right*right;
            if(sqr==c){
                return true;
            }else if(sqr>c){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}