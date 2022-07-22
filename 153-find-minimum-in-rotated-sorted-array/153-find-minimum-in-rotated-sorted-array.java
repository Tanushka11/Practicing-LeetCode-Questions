class Solution {
    public int findMin(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            else if(start <  mid && nums[mid-1] > nums[mid]){
                return nums[mid];
            }
            else if(nums[mid] > nums[start]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return nums[0];
    }
}