class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 0;

        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = n-1;
        
        while(count < (n*n)){
            // top
            for(int i = minRow, j= minCol ; j <= maxCol && count < (n*n); j++){
                count++;
                matrix[i][j] = count;
            }
            minRow++;
            // right
            for(int i = minRow, j= maxCol ; i <= maxRow && count < (n*n); i++){
                count++;
                matrix[i][j] = count;
            }
            maxCol--;
            // bottom
            for(int i = maxRow, j = maxCol ; j>= minCol && count < (n*n); j--){
                count++;
                matrix[i][j] = count;
            }
            maxRow--;
            // left
            for(int i = maxRow, j= minCol ; i >= minRow && count < (n*n); i--){
                count++;
                matrix[i][j] = count;
            }
            minCol++;

        }
        return matrix;
    }
}