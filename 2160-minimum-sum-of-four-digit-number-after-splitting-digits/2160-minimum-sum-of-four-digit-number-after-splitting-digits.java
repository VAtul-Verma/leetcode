class Solution {
    public int minimumSum(int num) {
        int digitarray[]=new int[4];
        int i=0;
        while(num!=0){
            digitarray[i++]=num%10;
            num/=10;
        }
        Arrays.sort(digitarray);
        int nump1=digitarray[0]*10+digitarray[2];
        int nump2=digitarray[1]*10+digitarray[3];
return nump1+nump2;
    }
}