class Solution {
    public String multiply(String num1, String num2) {
        int nums[]=new int[num1.length()+num2.length()];
        if(num1.equals("0") || num2.equals("0"))return "0";
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                nums[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                nums[i+j]+=nums[i+j+1]/10 ; //carry
                    nums[i+j+1]=nums[i+j+1]%10;  //digit;
            }
        }
        int i=0;
        while(i<nums.length && nums[i]==0)i++;
        StringBuilder st=new StringBuilder("");
        while(i<nums.length){
            st.append(nums[i]);
            i++;
        }
        return st.toString();
    }
}