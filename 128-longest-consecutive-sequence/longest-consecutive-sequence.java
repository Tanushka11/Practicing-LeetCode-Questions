class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] - 1 == nums[i-1]){
                count++;
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                 count = 1;
            }
            if(count > longest){
                    longest = count;
                }
        }
        return longest;
    }
}