class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        // int sum=0;
        List<Integer>ans=new ArrayList<>();
        int d1=0;
        int d2=0;
        int i=num.length-1;
        while(i>=0 || k!=0 ||carry!=0){
               int sum=0;
            sum+=carry;
            if(k!=0){ 
                 d1=k%10;
                 // System.out.print(d1+" ");
                 k/=10;
                    }else if(k==0){
                d1=0;
            }
            if(i>=0){
                 d2=num[i--];
                 // System.out.print("!"+d2+" ");
            }else if(i<0){
                d2=0;
            }
            sum+=d1+d2;
            // System.out.print(sum+" ");
            ans.add(sum%10);
        // System.out.print(carry+" ");
            carry=sum/10;
           
        }
        // for(int m:ans){
        //     System.out.print(m+" ");
        // }
         Collections.reverse(ans);
        return ans;
    }
}