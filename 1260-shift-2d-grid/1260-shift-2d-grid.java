class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;   //Row size
        int c = grid[0].length;   //Column size
        List<List<Integer>> res = new ArrayList(); //List to store result
        
        for(int i=0; i<r; i++)
        {
            List<Integer> list = new ArrayList();
            for(int j=0; j<c; j++)
            {
                int pos = ((i*c+j)-k)%(r*c);  //considering this as 1D array and finding the position using modulo operator.
                if(pos < 0) pos+=(r*c);   //modulo operator returns remainder in java. We use this case to get modulo result for negative numbers.
                int rpos = pos/c;   //converting 1D position back to 2D row pos
                int cpos = pos%c;   //converting 1D position back to 2D col pos
                list.add(grid[rpos][cpos]);
            }
            res.add(list);
        }
        return res;
    }
}