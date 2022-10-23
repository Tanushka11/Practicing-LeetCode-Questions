class Solution {
    public int[] sortArrayByParityII(int[] nums) {
//         int n = nums.length;
//         int even =0;
//         int odd=1;
//         while(even < n && odd < n) {
//             if(nums[even] % 2 !=0){
//                 swap(nums,even, odd);
              
//                 odd+=2;
//             }
//             else{
//                   even +=2;
//             }
//         }
//         return nums;
        int n = nums.length;
        int i = 0, j = n-1;
        //i stands for even
        //j stands for odd
        while(i < n && j >= 0) {
            if   (nums[i]%2 == 0)    i += 2;
            else if(nums[j] %2 == 1) j -= 2;
            else{
               swap(nums,i,j);
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