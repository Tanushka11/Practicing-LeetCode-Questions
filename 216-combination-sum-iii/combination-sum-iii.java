class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper (int start, int target, int k , List<Integer> cf){
        
        if( target == 0 && cf.size() == k){
            ans.add(new ArrayList<>(cf));
            return;
        }
        // pick
        for(int i = start; i<=9; i++){
        cf.add(i);
        helper(i+1,target-i,k,cf);
        cf.remove(cf.size() - 1);
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(1,n,k,new ArrayList<>());
        return ans;
    }
}