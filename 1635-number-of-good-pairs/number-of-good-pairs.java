class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            int v = map.getOrDefault(i,0);
            ans += v;
            map.put(i,v+1);
        }
        return ans;
    }
}