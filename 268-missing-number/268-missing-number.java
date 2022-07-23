class Solution {
    public int missingNumber(int[] nums) {
      sortTheArray(nums);
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    void sortTheArray(int[] nums){
        int i = 0;
        while(i < nums.length){
            int ci = nums[i];
            if(nums[i] < nums.length && nums[i] != i){
                swap(nums,i,ci);
            }
            else if(nums[i] >= nums.length || nums[i] == i){
                i++;
            }
        }
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}