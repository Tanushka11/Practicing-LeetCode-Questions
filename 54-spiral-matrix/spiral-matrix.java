class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int minRow = 0;
        int minCol = 0;
        int maxRow = row - 1;
        int maxCol = col - 1;
        int count = 0;

        while(count < (row * col)){
            // top wall
            for(int i = minRow, j = minCol; j <= maxCol && count < (row * col); j++){
                ans.add(matrix[i][j]);
                count++;
            }
            minRow++;
            // right wall
            for(int i = minRow,j = maxCol; i<=maxRow && count < (row * col) ; i++){
                ans.add(matrix[i][j]);
                count++;
            }
            maxCol--;
            // bottom row
            for(int i = maxRow , j = maxCol; j>=minCol && count < (row * col); j--){
                ans.add(matrix[i][j]);
                count++;
            }
            maxRow--;
            // left wall
            for(int i = maxRow, j = minCol; i>=minRow && count < (row * col); i--){
                ans.add(matrix[i][j]);
                count++;
            }
            minCol++;

        }

       return ans;

    }
}