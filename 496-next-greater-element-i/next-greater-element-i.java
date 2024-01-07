class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i<nums1.length; i++){
            int e = nextGreaterElem(nums2 , nums1[i]);
            nums1[i] = e;
        }
        return nums1;
    }
    int nextGreaterElem(int[] nums2 , int x){
        if(x == nums2[nums2.length-1]){
                return -1;
            }
        for(int i = 0; i<nums2.length; i++){
             if( nums2[i] == x && i< nums2.length - 1){
                int max = -1;
                for(int k = i; k<nums2.length; k++){
                    if(nums2[k] > max){
                        max = nums2[k];
                        if(max > x){
                           return max;
                      }
                    }
                }
                
            }
        }
        return -1;
    }
}