class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int v = map.getOrDefault(nums[i] , 0);
            map.put(nums[i] , v+1);
        }
        HashSet<Integer> nums1 = new HashSet<>();
        HashSet<Integer> nums2 = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) >= 2){
                nums1.add(nums[i]);
                nums2.add(nums[i]);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0 && map.get(nums[i]) == 1 && nums1.size() < nums.length/2){
                nums1.add(nums[i]);
                nums[i] = 0;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0 && map.get(nums[i]) == 1){
                nums2.add(nums[i]);
                nums[i] = 0;
            }
        }
        System.out.print(nums1);
        System.out.print(nums2);
        if(nums1.size() == nums.length/2 && nums2.size() == nums.length/2){
            return true;
        }
        return false;
    }
}