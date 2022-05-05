class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []ans =new int[nums.length];
       Stack<Integer>st=new Stack<>();
        
        for(int i=nums.length-2;i>=0;i--) {  //checking elements before making answer
           while(st.size()>0 && st.peek()<=nums[i]){
               st.pop();                             //pop
           }
            st.push(nums[i])  ; //push
        }
        
         for(int i=nums.length-1;i>=0;i--){   //checking elements before making answer
           while(st.size()>0 && st.peek()<=nums[i]){
               st.pop();                             //pop
           }
             ans[i]=st.size()==0?-1:st.peek();  //making answer
            st.push(nums[i])  ; //push
        }
       
        return ans;
    }
}