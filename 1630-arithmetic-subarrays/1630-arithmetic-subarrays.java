class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    List<Boolean>res=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                temp.add(nums[j]);
            }
            Collections.sort(temp);
            int d=0;
            for(int j=1;j<temp.size();j++){
                if(j==1){
                    d=temp.get(j)-temp.get(j-1);
                    
                }else if(d!=(temp.get(j)-temp.get(j-1))){
                    res.add(false);
                    break;
                }
                if(j+1==temp.size()){
                    res.add(true);
                }
            }
        }
        return res;
    }
}