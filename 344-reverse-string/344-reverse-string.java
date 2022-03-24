class Solution {
    public void reverseString(char[] s) {
     helper(s,0,s.length-1);

    }
    public void helper(char[] s ,int left ,int right){
     while(left<=right){
         char temp=s[left];
         s[left]=s[right];
         s[right]=temp;
         left++;
         right--;
     }
    }
}