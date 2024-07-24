class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] == 2) ans ^= nums[i];
        }
        return ans;
    }
}