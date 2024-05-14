class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] candidates,int i, int target, List<Integer> cf, boolean prev){
        if(target == 0){
              ans.add(new ArrayList<>(cf));
               return;
        }
        if(i == candidates.length || target < 0){
            return;
        }
        
        // not picking
        helper(candidates, i+1, target, cf, false);
        if(i>0 && candidates[i] == candidates[i-1] && (!prev)){
            return;
        }

        //picking
        cf.add(candidates[i]);
        helper(candidates, i+1, target-candidates[i], cf, true);
        cf.remove(cf.size() - 1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,0,target, new ArrayList<>(), false);
        return ans;
    }
}