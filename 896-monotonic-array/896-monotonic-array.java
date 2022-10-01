class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = nums.length -1; 
        if(nums[0] <= nums[j]){
            for(int k =0; k<j; k++){
                if(nums[k] >nums[k+1]){
                    return false;
                }
            }
        }
        else{
            for(int k =0; k<j; k++){
                if(nums[k] <nums[k+1]){
                    return false;
                }
            }
        }
        return true;
    }
}