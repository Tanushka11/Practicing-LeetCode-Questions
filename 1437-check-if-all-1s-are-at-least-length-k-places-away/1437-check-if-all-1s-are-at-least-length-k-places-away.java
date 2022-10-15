class Solution {
    public boolean kLengthApart(int[] nums, int k) {
      
     int previndex = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                if(previndex != -1 && i-previndex <= k)
                {
                    return false;
                }
                previndex = i;
            }
            
        }
        return true;
    }
}