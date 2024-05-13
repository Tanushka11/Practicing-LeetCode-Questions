class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] candidates, int target, int i, List<Integer> cf){
        if(target == 0){
            ans.add(new ArrayList<>(cf));
            return;
        }
        if(target < 0 || i == candidates.length ){
            return;
        }
        // not picking the current element
        helper(candidates, target, i+1, cf);

        // picking
        cf.add(candidates[i]);
        helper(candidates, target - candidates[i], i, cf);
        cf.remove(cf.size() - 1);
    } 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,0, new ArrayList<>());
        return ans;
    }
}