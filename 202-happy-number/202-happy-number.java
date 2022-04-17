class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet();
        int val=0;
        int rem=0;
        while(true){
            val=0;
            while(n>0){
            rem=n%10;
                val+=rem*rem;
                n=n/10;
            }
            if(val==1){  //happy number
                return true;
            }else if(set.contains(val)){
                break;
                     //loop found   A--->B--->C--->D---->A   type loop;
            }
            set.add(val);
            n=val;
        }
        return false;
        
    }
}