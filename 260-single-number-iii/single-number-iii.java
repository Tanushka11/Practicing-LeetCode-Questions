class Solution {
    public int[] singleNumber(int[] nums) {
        // get a xor of all numbers present in nums
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        // find the righmost set bit
        int rightMostSetBit = xor & (-xor)
        ;

        // we know the distict elements would have distinct set bits thus we
        // traverse through the array and put & operation with rightMostSetBit to each element to distinguish
        // between the elements;
        int b1 = 0;
        int b2 = 0;
        for(int i : nums){
            if((i & rightMostSetBit) != 0) b1 ^= i;
            else b2 ^= i;
        }
        return new int[] {b1,b2};
    }
}