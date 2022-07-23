class Solution {
    public int findDuplicate(int[] nums) {
        CyclicSort(nums);
       return nums[nums.length-1];
    }
    void CyclicSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int ci = nums[i] - 1;
            if( nums[i] != nums[ci] && nums[i] != ci){
                swap(nums,i,ci);
            }
            
            else{
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