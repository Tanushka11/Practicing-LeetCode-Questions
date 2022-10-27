class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int[] ans = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < pivot) {
                ans[k] = nums[i];
                k++;
            }
            
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == pivot) {
                ans[k] = nums[i];
                k++;
            }
            
        }
        for(int i=0;i<nums.length;i++) {
            if(k<nums.length && nums[i] > pivot) {
                ans[k] = nums[i];
                k++;
            }
        }
        
        return ans;
    }
}