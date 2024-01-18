class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int v = map.getOrDefault(nums[i] , 0);
            map.put(nums[i] , v+1);
        }
        int ps = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                ps += nums[i];
            }else{
                break;
            }
        }
        while(map.containsKey(ps)){
            ps++;
        }
        return ps;
    }
}