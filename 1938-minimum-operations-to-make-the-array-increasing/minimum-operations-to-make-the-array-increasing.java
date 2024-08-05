class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int i = 0;
        while(i < nums.length - 1){
            if(nums[i] >= nums[i+1]){
                count += (nums[i] - nums[i+1]) + 1;
                nums[i+1] = nums[i] + 1;
            }
            i++;
        }
        
        return count;
    }
}