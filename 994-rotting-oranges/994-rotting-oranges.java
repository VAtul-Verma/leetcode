class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)return 0;
        Queue<int []>queue=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                    
                } if(grid[i][j]!=0){
                    total++;
                }
            }
        }
        int []dx={0,0,1,-1};
        int []dy={1,-1,0,0};
        
        int day=0,cnt=0;
        while(queue.size()>0){
            int k=queue.size();
            cnt+=k;
            for(int j=0;j<k;j++){
                int []p=queue.poll();
                for(int i=0;i<4;i++){
                    int x=p[0]+dx[i];
                    int y=p[1]+dy[i];
                    if(x<0 || y<0 || x>=n ||y>=m || grid[x][y]==0 ||grid[x][y]==2)continue;
                    
                    grid[x][y]=2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size()!=0)day++;
        }
        return total==cnt?day:-1;
    }
}