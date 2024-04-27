class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int val = nums[k];
        int time = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < k){
                time += Math.min(val,nums[i]);
            }
            else if(i == k){
                time += val;
            }
            else{
              if(nums[i] < val)  time += nums[i];
              else time += val-1; 
            }
        }
        return time;

    }
}