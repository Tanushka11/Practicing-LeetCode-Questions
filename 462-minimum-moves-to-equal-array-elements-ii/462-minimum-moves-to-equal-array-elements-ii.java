class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int start=0;
        int end=nums.length-1;
        while(start<end){
         count +=nums[end] - nums[start];
            start++;
            end--;
        }
        return count;
    }
}