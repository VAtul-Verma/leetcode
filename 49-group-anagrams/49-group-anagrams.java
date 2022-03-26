class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String str:strs){
            String code=getcode(str);
            if(map.containsKey(code)){
               ArrayList<String>list =map.get(code);
                list.add(str);
               
            }else{
                ArrayList<String>list=new ArrayList<String>();
                list.add(str);
                map.put(code,list);
                
            }
           
            }
          List<List<String>>res=new ArrayList<>();
            for(String key:map.keySet()){
                ArrayList<String>sans=map.get(key);
                res.add(sans);
            }
        return res;
    }
    public String getcode(String str){
       int []a=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            a[ch-'a']++;
        }
        String code="";
        for(int i=0;i<a.length;i++){
            int f=a[i];
            if(f>0){
                char c=(char)(i+'a');
                code=code+c+f+"";
            }
        }
        return code;
    }
}