class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int min = nums[0];
            int ind = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] < min) {
                    min = nums[i];
                    ind = i;
                }
            }
            nums[ind] = nums[ind] * multiplier;
            k--;
        }
        return nums;
    }
}