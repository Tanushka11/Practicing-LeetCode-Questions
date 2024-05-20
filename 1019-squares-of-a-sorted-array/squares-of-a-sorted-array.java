class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length - 1;
       int i = 0;
       int j = n;
       int k = n;
       int[] ans = new int[n+1];
       while(i <= j){
        int s1 = nums[i] * nums[i];
        int s2 = nums[j] * nums[j];
        if(s1 >= s2){
            ans[k] = s1;
            i++;
        }
        if(s2 > s1){
            ans[k] = s2;
            j--;
        }
        k--;
       }
       return ans;
    }
}