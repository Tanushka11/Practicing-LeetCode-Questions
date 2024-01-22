class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(!map.containsKey(nums[i][j])){
                    map.put(nums[i][j] , 1);
                }else{
                    int v = map.get(nums[i][j]);
                    if(v != i+1){
                        map.put(nums[i][j], v+1);
                    }
                }
            }
        }
        for(int k : map.keySet()){
            if(map.get(k) >= nums.length){
                ans.add(k);
            }
        } 
        Collections.sort(ans);
        return ans;
    }
}