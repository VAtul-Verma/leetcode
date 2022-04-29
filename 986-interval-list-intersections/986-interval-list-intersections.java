class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
      ArrayList<ArrayList<Integer>>tans=new ArrayList<>();
        int aptr=0;
        int bptr=0;
      
        int asize=fl.length;
        int bsize=sl.length;
        while(aptr<asize && bptr<bsize){
            ArrayList<Integer>temp=new ArrayList<>();
            if(sl[bptr][0]<=fl[aptr][1] && fl[aptr][0]<=sl[bptr][1]){
                temp.add(Math.max(fl[aptr][0],sl[bptr][0]));
                 temp.add(Math.min(fl[aptr][1],sl[bptr][1]));
                tans.add(temp);}
                if(fl[aptr][1]<sl[bptr][1]){
                    aptr++;
                }else{
                    bptr++;
                }
                
            
        }
        int ans[][]=new int[tans.size()][2];
        for(int i=0;i<tans.size();i++){
            for(int j=0;j<2;j++){
                ans[i][j]=tans.get(i).get(j);
            }
        }
        return ans;
    }
}