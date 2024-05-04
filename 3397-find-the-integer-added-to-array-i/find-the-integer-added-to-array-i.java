class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1[0] == nums2[0]){
            return 0;
        }
        if(nums1[0] < nums2[0]){
            return  nums2[0] - nums1[0];
        }
        if(nums1[0] > nums2[0]){
            return - (nums1[0] - nums2[0]);
        }
        return 0;
    }
}