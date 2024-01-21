class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0 ; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int j = 0 ; j <nums2.length; j++){
            set2.add(nums2[j]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int k = 0 ; k<nums1.length; k++){
           if(!set2.contains(nums1[k]) && !list1.contains(nums1[k])){
               list1.add(nums1[k]);
           }
        }
        for(int l = 0 ; l<nums2.length; l++){
           if(!set1.contains(nums2[l]) && !list2.contains(nums2[l])){
               list2.add(nums2[l]);
           }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}