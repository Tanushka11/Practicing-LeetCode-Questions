class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int start = 0;
        int end = mat[0].length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int row  = findMaxInRow(mat,mid);
            int leftElem = -1;
        int rightElem = -1;
            if(mid > 0){
                leftElem = mat[row][mid-1];
            }
            if(mid < mat[0].length -1){
                rightElem = mat[row][mid+1];
            }
            if(mat[row][mid] > leftElem && mat[row][mid] > rightElem){
                return new int[] {row,mid};
            }else if(mat[row][mid] < leftElem){
                 end = mid-1;
            }else{
                start = mid+1;
            }
        }
         return new int[] {-1,-1};
    }
    int findMaxInRow(int[][] mat, int c){
        int max = -1;
        int ind = -1;
        for(int r = 0; r < mat.length; r++){
            if(mat[r][c] > max){
                ind = r;
                max = mat[r][c];
            }
        }
        return ind;
    }
}
