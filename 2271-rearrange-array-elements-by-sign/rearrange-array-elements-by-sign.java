class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int k = 0;
        while(i < nums.length ){
            if(nums[i] > 0 && k < nums.length){
              ans[k] = nums[i];
              k += 2;
            }
            i++;
        }
        int n = 0;
        int l = 1;
        while(n < nums.length ){
            if(nums[n] < 0 && l < nums.length){
                ans[l] = nums[n];
                l +=2;
            }
            n++;
        }
        return ans;
    }
}