class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++ ){
           
            if( areDigitsEven(nums,i)){
                count ++;
            }
        }
        
        return count;
    }
     boolean areDigitsEven(int[] nums, int i){
         
         
        if( numberOfDigits(nums,i) % 2 == 0){
            return true;
        }
        
             return false;
         
     }
    int numberOfDigits(int[] nums, int i){
        int count=0;
        if(nums[i]==0){
            return 1;
        }
        if(nums[i]<0){
            nums[i]=nums[i] * (-1);
        }
         while(nums[i]>0){
            count++;
           nums[i]= nums[i]/10;
             
         }
        return count;
    }
}