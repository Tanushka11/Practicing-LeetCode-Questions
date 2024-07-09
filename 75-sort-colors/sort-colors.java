class Solution {
    public void sortColors(int[] nums) {
        // i should be at 0  , j should be at 1 and k should be at 2
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while(j <= k){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 1){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }
}