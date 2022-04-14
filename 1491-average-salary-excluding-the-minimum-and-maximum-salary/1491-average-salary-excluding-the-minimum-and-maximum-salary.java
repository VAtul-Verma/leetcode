class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        double sum=0;
        int  max=0;
    
        int min=Integer.MAX_VALUE;
        for(int i:salary){
             max= Math.max(max,i);
            min=Math.min(min,i);
            sum+=i;
           
        }
        sum=sum-max-min;
        // System.out.println(max+"  "+min+" "+sum);
    
        return sum/(n-2);
        
    }
}