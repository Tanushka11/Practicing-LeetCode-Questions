class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i : nums1){
            if(i < min1){
                min1 = i;
            }
        }
        for(int i : nums2){
            if(i < min2){
                min2 = i;
            }
        }
        return min2 - min1;
    }
}