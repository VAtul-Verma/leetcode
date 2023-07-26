class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int max = 10000000;
        int min = 1;
        int res = Integer.MAX_VALUE;
        while(min <= max){
            int mid = (int) (min + max) / 2;
            System.out.println(mid);
            double h = helper(dist, mid);
            if(h <= hour){
                res = Math.min(res, mid);
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return res == Integer.MAX_VALUE ? -1 : (int) res;
    }
    private double helper(int[] dist, int speed){
        double count = 0;
        for(int i=0; i < dist.length; i++){
            if(i != dist.length - 1){
                count += Math.ceil(dist[i] * 1.0 / speed);
                
            }else{
                count += dist[i] * 1.0 / speed;
            }
            
        }
        return count;
    }
}