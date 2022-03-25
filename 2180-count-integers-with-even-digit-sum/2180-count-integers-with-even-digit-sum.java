class Solution {
    public int countEven(int num) {
        int cnt=0;
       if(num<10 && num%2==1){
           cnt+=num/2;
       }
        else if(num<10){
            while(num%2==0){
                cnt++;
                num/=2;
            }
        }else{
                for(int i=1;i<=num;i++){
                    int dsum=digitsum(i);
                    if(dsum%2==0){
                        cnt++;
                    }
                }
            }
            return cnt;
        
    }
    public int digitsum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
        
    }
}