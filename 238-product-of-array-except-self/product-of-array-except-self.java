class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        for(int i = nums.length - 1; i>= 0; i--){
            prod *= nums[i];
            ans[i] = prod;
        }
        prod = 1;
        for(int i = 0; i<nums.length-1; i++){
            ans[i] = prod * ans[i+1];
            prod *= nums[i];
        }
        ans[nums.length-1] = prod;
        return ans;
    }
}