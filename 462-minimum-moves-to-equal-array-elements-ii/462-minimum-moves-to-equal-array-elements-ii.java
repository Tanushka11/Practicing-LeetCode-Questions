class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int start=0;
        int end=nums.length-1;
        // while(start<end){
        //  count +=nums[end] - nums[start];
        //     start++;
        //     end--;
        // }
        // return count;
       
        
        int median;
        if(nums.length % 2 !=0){
            median=nums[nums.length/2];
        }
        else{
            median= Math.round((nums[nums.length/2] + nums[nums.length/2 -1])/2);
        }
        while(start<=end){
         count +=Math.abs(median-nums[start]);
            start++;
            
    }
       return count;   
}
  
}