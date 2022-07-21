class Solution {
    public int findKthLargest(int[] nums, int k) {
        // reverse(nums,0,nums.length-1);
        Arrays.sort(nums);
        int n = nums.length-k;
        return nums[n];
    
   
    }
    //   void reverse(int[] nums, int first, int second){
    //       while(first<second){
    //     swap(nums,first,second);
    //     first++;
    //     second--;
    //       }
    // }
    // void swap(int[] nums, int start, int end){
    //     int temp = nums[start];
    //     nums[start] = nums[end];
    //     nums[end] = temp;
    // }
}