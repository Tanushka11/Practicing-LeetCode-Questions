class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even =0;
        int odd=1;
        while(even < n && odd < n) {
            if(nums[even] % 2 !=0){
                swap(nums,even, odd);
              
                odd+=2;
            }
            else{
                  even +=2;
            }
        }
        return nums;
    }
     void swap (int[] nums,int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}