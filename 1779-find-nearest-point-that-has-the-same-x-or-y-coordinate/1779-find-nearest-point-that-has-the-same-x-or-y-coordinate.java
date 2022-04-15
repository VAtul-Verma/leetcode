class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        // Arrays.sort(points,(a,b)->a[0]-b[0]);
        int ans=Integer.MAX_VALUE;
        int id=0;
        for(int i=0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
               int d=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                   if(d<ans){
                       ans=d;
                       id=i;
                   }
               
            }
        }
        if (ans==Integer.MAX_VALUE)return -1;
        return id;
    }
}