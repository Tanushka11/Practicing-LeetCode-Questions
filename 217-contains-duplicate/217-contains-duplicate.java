class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        if(nums.length==1){
            return false;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}