class Solution {
    public int singleNumber(int[] nums) {
        int sn = 0;
        for(int i : nums){
            sn ^= i;
        }
        return sn;
    }
}