class Solution {
    public int []leftmax(int []height){
        int [] res= new int[height.length];
        res[0]=height[0];
        for(int i=1;i<height.length;i++){
            res[i]=Math.max(height[i],res[i-1]);
        }
        return res;
            
    }
    
     public int []rightmax(int []height){
        int [] res= new int[height.length];
        res[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            res[i]=Math.max(height[i],res[i+1]);
        }
        return res;
            
    }
    public int trap(int[] height) {
        int []lmax=leftmax(height);
        int []rmax=rightmax(height);
        int water=0;
        for(int i=0;i<height.length;i++){
            water+=Math.min(lmax[i],rmax[i])-height[i];
        }
return water;
    }
}