class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        int[] prefixProd = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            prod *= nums[i];
            prefixProd[i] = prod;
        }
        prod = 1;
        for(int i = nums.length - 1; i>0 ; i--){
            ans[i] = prefixProd[i-1] * prod;
            prod *= nums[i];
        }
        ans[0] = prod;
        return ans;
    }
}