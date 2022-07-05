class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int LongestStreak=1;
        int count=1;
        for(int i=1; i<nums.length;i++){
                if(nums[i]-1==nums[i-1]){
                    LongestStreak++;
                    
                }
            else if(nums[i-1]==nums[i]){
              continue;
            }
            else{
                count= Math.max(LongestStreak, count);
                LongestStreak=1;
            }
             count= Math.max(LongestStreak, count);
        }
       
        return count;
    }
}