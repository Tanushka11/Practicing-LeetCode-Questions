class Solution {
    public int minimumArea(int[][] grid) {
        int r1 = Integer.MAX_VALUE;
        int r2 = Integer.MIN_VALUE;
        int c1 = Integer.MAX_VALUE;
        int c2 = Integer.MIN_VALUE;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j <grid[0].length; j++){
                if(grid[i][j]==1){
                    r1 = Math.min(r1,i);
                    r2 = Math.max(r2,i);
                    c1 = Math.min(c1,j);
                    c2 = Math.max(c2,j);
                }
            }
        }
        return ((r2-r1)+1) * ((c2-c1)+1);
        
    }
}