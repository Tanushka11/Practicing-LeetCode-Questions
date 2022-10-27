class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        
        for(int i = 0; i<result.length; i++){
            
         for(int j = 0; j<result.length; j++){
            int max = Integer.MIN_VALUE;
             
             for(int k = i; k<i+3; k++) {
                 for(int l = j; l<j+3; l++) {
                 max = Math.max(max,grid[k][l]);
             } 
             }
             result[i][j] = max;
        }   
        }
        return result;
    }
}