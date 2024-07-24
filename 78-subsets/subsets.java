class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int total = (int) Math.pow(2,n);
        for(int i = 0; i < total; i++){
            List<Integer> subset = new ArrayList<>();
            for(int bitPosition = 0; bitPosition < n; bitPosition++){
                int mask = 1 << bitPosition;
                if((i & mask) != 0) subset.add(nums[bitPosition]);
            }
            ans.add(subset);
        }
        return ans;
    }
}