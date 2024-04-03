class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int i = 0;
        while(i < nums.length - 1){
            int j = i+1;
            while(j < nums.length){
                if(nums[i] == nums[j]){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}