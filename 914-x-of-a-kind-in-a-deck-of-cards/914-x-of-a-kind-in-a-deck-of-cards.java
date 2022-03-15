class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:deck){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int gcd=1;
        int cnt=0;
        for(int key:map.keySet()){
            if(cnt==0){
                gcd=map.get(key);
            }else{
            gcd=Gcd(map.get(key),gcd);
            }
            cnt++;
        }
        return (gcd>=2?true:false);
    }
    public int Gcd(int a, int b) {
   if (b==0) return a;
   return Gcd(b,a%b);
}
}