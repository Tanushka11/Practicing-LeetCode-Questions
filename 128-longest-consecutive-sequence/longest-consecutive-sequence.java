class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int currElement : set){
            int len = 1;
            if(!set.contains(currElement - 1)){
                while(set.contains(currElement + len)){
                    len++;
                }
                max = Math.max(len,max);
            }
        }
        return max;
    }
}