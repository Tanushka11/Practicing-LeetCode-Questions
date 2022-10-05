class Solution {
    public int largestPerimeter(int[] nums) {
        int larPer = 0;
        
        Arrays.sort(nums);
        int i = nums.length-1;
        while(i >= 2){
          if( nums[i-2] + nums[i-1] > nums[i]){
              larPer = nums[i] + nums[i-1] + nums[i-2];
              return larPer;
          }
            else{
                i = i-1; 
            }
        }
        return larPer;
    }
}