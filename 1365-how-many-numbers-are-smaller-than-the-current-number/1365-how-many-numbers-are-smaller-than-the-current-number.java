class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] output= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
               if( nums[j]<nums[i]  && i!=j ){
                    count++;
                }
            }
            output[i]=count;
        }
        return output;
    }
}