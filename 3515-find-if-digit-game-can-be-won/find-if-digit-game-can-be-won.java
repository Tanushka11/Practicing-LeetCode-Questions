class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneDigit = 0;
        int twoDigit = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 10){
                oneDigit += nums[i];
            }else{
                twoDigit += nums[i];
            }
        }
        if(oneDigit > twoDigit) return true;
        if(oneDigit < twoDigit) return true;
        return false;
    }
}