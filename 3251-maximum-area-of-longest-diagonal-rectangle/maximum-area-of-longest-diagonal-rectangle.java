class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = Integer.MIN_VALUE;
        int maxArea = -1;
        double diagonal = 1;
        for(int i = 0; i<dimensions.length; i++){
            diagonal = Math.sqrt( Math.pow(dimensions[i][0],2) +  Math.pow(dimensions[i][1],2));
            int area = dimensions[i][0] * dimensions[i][1];
            if(diagonal > max ){
                max = diagonal;
                maxArea = area;
            }else if(diagonal == max){
                  maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}