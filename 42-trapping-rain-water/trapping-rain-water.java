class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        int ans = 0;

        while(low < high){
            if(height[low] < height[high]){
                leftMax = Math.max(height[low] , leftMax);
                ans +=  leftMax - height[low];
                low++;
            }else{
                rightMax = Math.max(height[high] , rightMax);
                ans +=  rightMax - height[high];
                 high--;
            }
        }
        return ans;
    }
}