class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] ans = new int[nums.length];
       int k = nums.length-1;
       int i = 0;
       int j = nums.length - 1;
       while(i <= j){
           int s1 = nums[i] * nums[i];
           int s2 = nums[j] * nums[j];
           if(s1 >= s2){
               ans[k] = s1;
               i++;
           }else{
               ans[k] = s2;
               j--;
           }
           k--;
       }
       return ans;
    }
}