class Solution {
    public boolean kLengthApart(int[] nums, int k) {
      
     
        for(Integer previndex = null,i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                if(previndex != null && i-previndex <= k)
                {
                    return false;
                }
                previndex = i;
            }
            
        }
        return true;
    }
}