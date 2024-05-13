class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] nums, int i, List<Integer> combination){
        //base case
        if(i == nums.length){
           ans.add(new ArrayList <>(combination));
           return;
        }
       

        // pick
         combination.add(nums[i]);
         helper(nums,i+1,combination);
         combination.remove(combination.size() - 1);
        
          //do not pick
           helper(nums,i+1,combination);
    }
    public List<List<Integer>> subsets(int[] nums) {
       helper(nums,0, new ArrayList<>());
       return ans;
    }
}