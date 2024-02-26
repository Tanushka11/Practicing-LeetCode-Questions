class Solution {
    public int[] runningSum(int[] nums) {
        //with recursion
        return recursiveFunc(nums,0,0);
    }
    int[] recursiveFunc(int[] nums, int i, int sum){
        if(i == nums.length){
            return nums;
        }
       sum += nums[i];
       nums[i] = sum;
       return recursiveFunc(nums,i+1,sum); 
    }
}