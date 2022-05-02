class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int sum=0;
        map.put('I',1);
          map.put('V',5);
          map.put('X',10);
          map.put('L',50);
          map.put('C',100);
          map.put('D',500);  
          map.put('M',1000);
        sum+=map.get(s.charAt(n-1));
          for(int i=n-2;i>=0;i--){
              char ch=s.charAt(i);
              if(map.containsKey(ch)){
                  if(map.get(ch)<map.get(s.charAt(i+1))){
                       sum-=map.get(ch);
                     
                  }else{
                      sum+=map.get(ch);
                  }
                  
              }
          }
        return sum;
    
        
    }
}