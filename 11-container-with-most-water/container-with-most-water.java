class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        while(i < j){
           int length = j-i;
            int max = Math.min(height[i], height[j]);
             area = Math.max(area, (max*length));
            if(height[i] < height[j]){
                i++;
            } 
            else{
                j--;
            } 

           
        }
        return area;
    }
}

