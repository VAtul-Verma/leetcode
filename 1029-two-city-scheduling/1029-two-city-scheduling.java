class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->((b[1]-b[0])-(a[1]-a[0])));   //sort on the basis of the diffrence or cityA ans cityB using lambda function
        int sum=0;
        for(int i=0;i<costs.length/2;i++){
            sum+=costs[i][0];                       //cost go to city A
            sum+=costs[costs.length-1-i][1];        //cost goto city B
            }
        return sum;
        
    }
}