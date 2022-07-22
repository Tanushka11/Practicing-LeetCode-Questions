
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
//         time complexity - O(n)
//         space complexity - O(1)
       
        int[] output = new int[nums.length];
         if(nums.length<1){
            return output;
        }
        
        int product = 1;
        
        for(int i = 0 ; i < nums.length ; i++){
               product *= nums[i];
                 output[i] = product;
           
        }
        
        product = 1;
        
        for(int i = nums.length - 1 ; i>0 ; i--){
            output[i] = output[i-1] * product;
            product *= nums[i];
        }
        
        output[0] = product;
        return output;
    }
}
