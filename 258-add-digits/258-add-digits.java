class Solution {
    public int addDigits(int num) {
     if(num==0){
         return 0;
     }   
      
        int digitisum=num%10+addDigits(num/10);
       if(digitisum>9){
           int ans=0;
           while(digitisum!=0){
               ans+=digitisum%10;
               digitisum/=10;
           }
           return ans;
       }
        return digitisum;
        
    }
}