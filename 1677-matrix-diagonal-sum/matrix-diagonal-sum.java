class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
       // 00 11 22 33 
       //03 11 20 30

       int r = mat.length;
       int c = mat[0].length;
       for(int i = 0; i < r; i++){
        int pd = mat[i][i];
        int sd = mat[i][c-i-1];
        
        sum += pd;
        sum += sd;
        
       }
       if(r % 2 != 0){
            sum -= mat[r/2][c/2];
        }
       return sum;
    }
}