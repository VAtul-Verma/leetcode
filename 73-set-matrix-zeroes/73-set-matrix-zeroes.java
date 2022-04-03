class Solution {
    public void setZeroes(int[][] arr) {
        int []row=new int[arr.length];
        Arrays.fill(row,Integer.MIN_VALUE);
       
        int []col=new int[arr[0].length];
         Arrays.fill(col,Integer.MIN_VALUE);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int val:row){
            System.out.print(val+" ");
        }
        System.out.println(0);
         for(int val:col){
            System.out.print(val+" ");
        }
         for(int i=arr.length-1 ;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                if(row[i]==0 || col[j]==0){
                    arr[i][j]=0;
                }
            }
        }
        
        
    }
}