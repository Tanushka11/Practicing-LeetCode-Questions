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
        for(int k = 0; k < nums.length; k++)
        System.out.print(nums[k]);
        return count;
    }
}