class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
               sum+=nums[i];
           }
            else if (nums[i]==0){
                sum=0;
            }
            
            max=Math.max(max,sum);
        }
        return max;
    }
}