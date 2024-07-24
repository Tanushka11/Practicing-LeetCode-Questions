class Solution {
    public int singleNumber(int[] nums) {
        int maxBits = 32;
        int[] sumOfBits = new int[maxBits];
        for(int number : nums){
            for(int bitPosition = 0; bitPosition < maxBits; bitPosition++){
                // checking if the bit is set or not,
                // if it is set then increaseing the counter by one at ith position
                if((number & (1 << bitPosition)) != 0){
                    sumOfBits[bitPosition]++;
                }
            }
        }
        int singleNumber = 0;
        for(int i = 0; i < maxBits; i++){
            if(sumOfBits[i] % 3  != 0){
                // set the ith bit of single number to one
                int mask = 1 << i;
                singleNumber |= mask;
            }
        }
        return singleNumber;
    }
}