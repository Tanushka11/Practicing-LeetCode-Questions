class Solution {
    public int findDuplicate(int[] nums) {
        // cyclic sort

        sortArray(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
    }
    void sortArray(int[] nums){
       int i=0;
        while(i<nums.length){
            int ci = nums[i] - 1;
            if(nums[i] != nums[ci]){
                swap(nums,i,ci);
            } 
            else{
                i++;
            }
        }
      
    }
      void swap(int[] nums,int first,int second){
        int temp=nums[first];
                nums[first]=nums[second];
        nums[second]=temp;
        
    }
}