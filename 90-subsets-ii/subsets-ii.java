class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] nums, int i, List<Integer> cf, Boolean prevElemPickedOrNot){
        if(i == nums.length){
            ans.add(new ArrayList<>(cf));
            return;
        }
           // not picked
        helper(nums,i+1, cf, false);
        // ignoring the same corrosponing elements which will generate duplicate subarrays
        if(i > 0 && (nums[i] == nums[i-1]) && (!prevElemPickedOrNot)){
           return;
        }
        // picked
        cf.add(nums[i]);
        helper(nums, i+1 , cf, true);
        cf.remove(cf.size() - 1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // it is similar to subsets problem here we just need to sort
        // the nums because we do not want duplicate subarray
        // by sortion we will be able to check how many corrosponding elements
        // are equal if they are equal then we will ignore them

        Arrays.sort(nums);
        helper(nums, 0,new ArrayList<>(), false);
        return ans;
    }
}