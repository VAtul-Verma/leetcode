class Solution {
    
    public double helper(double x, long n){
         if(n==0){
          return 1.0;
      }
         double temp=helper( x,n/2);
        if(n%2==0){
          
            return temp*temp;
        }else{
            return temp*temp*x;
        }
    }
    public double myPow(double x, long n) {
     
      if(n<0){
         double temp=helper(x,-n);
          return 1.0/temp;
      }
       else{
          return helper(x,n);
       }
    }
   
}