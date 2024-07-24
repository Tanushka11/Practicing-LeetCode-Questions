class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            int v = map.getOrDefault(i,0);
            map.put(i,v+1);
        }
        int ans = 0;
        for(int i : map.keySet()){
            int v  = map.get(i);
            if(v == 2){
                ans ^= i;
            }
        }
        return ans;
    }
}