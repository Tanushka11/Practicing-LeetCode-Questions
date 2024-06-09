class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 0; 
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[c]){
                nums[c + 1] = nums[i];
                c++;
            }
        }
        return c + 1;
    }
}