class Solution {
    public boolean kLengthApart(int[] nums, int k) {
      
    for(Integer previousOneIndex = null,i=0; i<nums.length; i++)
		if(nums[i]==1) {
			if(previousOneIndex != null && i-previousOneIndex <= k) return false;
			previousOneIndex = i;
		}
	return true;
}

}